package org.pulcini.stubspy;

import org.pulcini.jubhub.JubhubClient;
import org.pulcini.jubhub.model.EventListings;
import org.pulcini.jubhub.model.Listing;
import org.pulcini.stubspy.service.AlertService;
import org.pulcini.stubspy.service.Mailer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mike on 6/28/2016.
 */
@Component
public class ScheduledChecker {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledChecker.class);

    @Autowired
    Mailer mailer;

    @Autowired
    AlertService alertService;

    @Value("${notifications.email}")
    String notificationEmail;

    JubhubClient jubhubClient;

    Map<Integer, Double> lowestKnownPrice = new HashMap<Integer, Double>();

    @Autowired
    public ScheduledChecker(@Value("${stubhub.token}") String stubhubToken) {
        jubhubClient = new JubhubClient(stubhubToken);
    }

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
        EventListings eventListings = jubhubClient.retrieveEventListings(alert.getEventId(), alert.getZoneId());

        for (Listing listing : eventListings.getListing()) {
            if ( listing.getCurrentPrice().getAmount() < alert.getMaxPrice() ) {
                // check if lower than current known price
                if ( !lowestKnownPrice.containsKey(listing.getListingId() )) {
                    lowestKnownPrice.put(listing.getListingId(), listing.getCurrentPrice().getAmount());
                    sendInstantNotification(listing, alert);
                } else if ( lowestKnownPrice.get(listing.getListingId()) > listing.getCurrentPrice().getAmount() ) {
                    lowestKnownPrice.put(listing.getListingId(), listing.getCurrentPrice().getAmount());
                    sendInstantNotification(listing, alert);
                } else {
                    // already known; no-op
                }
            }
        }
    }

    private void sendInstantNotification(Listing listing, Alert alert) {
        mailer.sendMail(notificationEmail,"Tickets found!", "$" + listing.getCurrentPrice().getAmount() + " => " + listing.getSectionName() );
    }
}
