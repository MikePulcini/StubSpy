package org.pulcini.stubspy.service.persistence;

import org.pulcini.stubspy.model.BasicListing;
import org.pulcini.stubspy.model.stubhub.Listing;
import org.pulcini.stubspy.service.ScheduledChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
@ConditionalOnProperty(name = "app.persistence", havingValue = "inmemory")
public class InMemoryPersistenceService implements PersistenceService {

    private static final Logger logger = LoggerFactory.getLogger(InMemoryPersistenceService.class);

    public InMemoryPersistenceService() {
        logger.info("Using in-memory persistence...");
    }

    Map<String, Double> lowestKnownPrice = new HashMap<String, Double>();

    @Override
    public void saveLowestPrice(BasicListing listing) {
        lowestKnownPrice.put(getMapKey(listing), listing.getBasicTotalCost());
    }

    @Override
    public Double getLowestPrice(BasicListing listing) {
        return lowestKnownPrice.get(getMapKey(listing));
    }

    @Override
    public boolean isKnownListing(BasicListing listing) {
        return lowestKnownPrice.containsKey(getMapKey(listing));
    }

    private String getMapKey(BasicListing listing) {
        return listing.getBasicSource() + "||" + listing.getBasicListingId();
    }
}
