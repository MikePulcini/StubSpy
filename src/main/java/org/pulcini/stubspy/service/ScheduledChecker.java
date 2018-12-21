package org.pulcini.stubspy.service;

import org.pulcini.stubspy.client.JubhubClient;
import org.pulcini.stubspy.client.TicketmasterResaleClient;
import org.pulcini.stubspy.config.Alert;
import org.pulcini.stubspy.model.BasicListing;
import org.pulcini.stubspy.service.notification.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mike on 6/28/2016.
 */
@Component
public class ScheduledChecker {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledChecker.class);

    @Autowired
    NotificationService notificationService;

    @Autowired
    AlertService alertService;

    @Autowired(required = false)
    JubhubClient jubhubClient;

    Map<String, Double> lowestKnownPrice = new HashMap<String, Double>();

    @Autowired(required = false)
    TicketmasterResaleClient tmrClient;

    @Scheduled(cron = "*/30 * * * * *")
    public void checkInstant() {
        logger.debug("Starting check for instant notifications...");
        for ( Alert alert : alertService.getAlerts() ) {
            if ( alert.isInstantAlert() ) {
                checkInstant(alert);
            }
        }
    }

    private void checkInstant(Alert alert) {

        if ( jubhubClient != null && alert.getStubhub().isEnabled() ) {
            List<BasicListing> listings = jubhubClient.retrieveEventListings(alert.getStubhub().getEventId(), alert.getQuantity(), alert.getStubhub().getZoneId());
            logger.debug("Processing {} listings from Stubhub...", listings.size());
            processListings(listings, alert);
        }

        if ( tmrClient != null && alert.getTicketmasterResale().isEnabled() ) {
            List<BasicListing> listings = tmrClient.retrieveOffers(alert.getTicketmasterResale().getEventId(), alert.getTicketmasterResale().getSections());
            logger.debug("Processing {} listings from TicketmasterResale...", listings.size());
            processListings(listings, alert);
        }
    }

    private void processListings(List<BasicListing> listings, Alert alert) {
        for (BasicListing listing : listings) {

            // check to ensure it matches filter;
            if ( !isMatch(listing, alert) ) continue;

            if ( listing.getBasicTotalCost() < alert.getMaxPrice() ) {
                // check if lower than current known price
                if ( !lowestKnownPrice.containsKey(getMapKey(listing)) || lowestKnownPrice.get(getMapKey(listing)) > listing.getBasicTotalCost() ) {
                    lowestKnownPrice.put(getMapKey(listing), listing.getBasicTotalCost());
                    sendInstantNotification(listing, alert);
                } else {
                    // already known; no-op
                }
            }
        }
    }

    private String getMapKey(BasicListing listing) {
        return listing.getBasicSource() + "||" + listing.getBasicListingId();
    }

    private boolean isMatch(BasicListing listing, Alert alert) {
        // check row
        if ( !alert.getRows().contains(listing.getBasicRow()) ) {
            return false;
        }

        return true;
    }

    private void sendInstantNotification(BasicListing listing, Alert alert) {
        notificationService.sendNotification(
                 alert.getEventName() + " tickets found at " + listing.getBasicSource() + "!",
                "$" + listing.getBasicTotalCost() + " => " + listing.getBasicSection() + " / Row " + listing.getBasicRow() + " / Seats " + listing.getBasicSeatNumbers());
    }
}
