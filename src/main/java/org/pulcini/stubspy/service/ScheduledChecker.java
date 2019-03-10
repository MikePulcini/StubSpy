package org.pulcini.stubspy.service;

import org.pulcini.stubspy.client.StubhubClient;
import org.pulcini.stubspy.client.TicketmasterResaleClient;
import org.pulcini.stubspy.config.Alert;
import org.pulcini.stubspy.model.BasicListing;
import org.pulcini.stubspy.service.notification.NotificationService;
import org.pulcini.stubspy.service.persistence.PersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by mike on 6/28/2016.
 */
@Component
public class ScheduledChecker {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledChecker.class);

    @Autowired
    NotificationService notificationService;

    @Autowired
    PersistenceService persistenceService;

    @Autowired
    AlertService alertService;

    @Autowired(required = false)
    StubhubClient stubhubClient;

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

        if ( stubhubClient != null && alert.isStubhubEnabled() ) {
            List<BasicListing> listings = stubhubClient.retrieveEventListings(alert.getStubhubSearchCriteria());
            logger.debug("Processing {} listings from Stubhub...", listings.size());
            processListings(listings, alert);
        }

        if ( tmrClient != null && alert.isTicketmasterResaleEnabled() ) {
            List<BasicListing> listings = tmrClient.retrieveOffers(alert.getTicketmasterResaleSearchCriteria());
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
                if ( !persistenceService.isKnownListing(listing) || persistenceService.getLowestPrice(listing) > listing.getBasicTotalCost() ) {
                    persistenceService.saveLowestPrice(listing);
                    sendInstantNotification(listing, alert);
                }
            }
        }
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
