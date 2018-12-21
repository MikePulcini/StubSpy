package org.pulcini.stubspy.service.persistence;

import org.pulcini.stubspy.model.BasicListing;
import org.pulcini.stubspy.model.stubhub.Listing;

public interface PersistenceService {

    /**
     * Persists the current price for the listing as the lowest price.
     *
     * @param listing
     */
    void saveLowestPrice(BasicListing listing);

    /**
     * Retrieves the lowest known price for a given listing.
     *
     * @param listing
     * @return the lowest known price for the listing, or null if the listing was not found.
     */
    Double getLowestPrice(BasicListing listing);

    /**
     * Checks if a given listing has a previously tracked price.
     * @param listing
     * @return true if the listing was previously tracked, false otherwise
     */
    boolean isKnownListing(BasicListing listing);
}
