package org.pulcini.stubspy.client;

import org.apache.commons.lang3.StringUtils;
import org.pulcini.stubspy.model.BasicListing;
import org.pulcini.stubspy.model.stubhub.Event;
import org.pulcini.stubspy.model.stubhub.EventListings;
import org.pulcini.stubspy.model.stubhub.Listing;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JubhubClient {

    private static final String DEFAULT_BASE_URL = "https://api.stubhub.com";

    private Client client;
    private String token;
    private String baseURL;

    public JubhubClient(String token) {
        this(token, DEFAULT_BASE_URL);
    }

    public JubhubClient(String token, String baseURL) {
        this.baseURL = baseURL;
        this.token = token;

        client = ClientBuilder.newClient();
    }

    public Event retrieveEvent(long id) {
        Event e = client.target(baseURL)
                .path("/catalog/events/v3/" + id)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + token)
                .get(Event.class);

        return e;
    }

    public List<BasicListing> retrieveEventListings(long eventId, int zoneId) {
        return retrieveEventListings(eventId, -1, zoneId);
    }

    public List<BasicListing> retrieveEventListings(long eventId, int quantity, int zoneId) {
        return retrieveEventListings(eventId, quantity, Collections.singletonList(zoneId));
    }

    public List<BasicListing> retrieveEventListings(long eventId, int quantity, Collection<Integer> zoneIds) {
        WebTarget wt = client.target(baseURL)
                .path("/search/inventory/v2")
                .queryParam("eventId", eventId)
                .queryParam("zoneIDList", StringUtils.join(zoneIds, ','));

        if ( quantity > -1 ) {
            wt = wt.queryParam("quantity", quantity);
        }

        EventListings e = wt
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + token)
                .get(EventListings.class);

        List<BasicListing> ret = new ArrayList<BasicListing>();
        for ( Listing l : e.getListing() ) {
            ret.add(l);
        }

        return ret;
    }

    public List<BasicListing> retrieveBasicEventListings(long eventId, int quantity, Collection<Integer> zoneIds) {
        WebTarget wt = client.target(baseURL)
                .path("/search/inventory/v2")
                .queryParam("eventId", eventId)
                .queryParam("zoneIDList", StringUtils.join(zoneIds, ','));

        if ( quantity > -1 ) {
            wt = wt.queryParam("quantity", quantity);
        }

        EventListings e = wt
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + token)
                .get(EventListings.class);

        List<BasicListing> ret = new ArrayList<BasicListing>();
        for ( Listing l : e.getListing() ) {
            ret.add(l);
        }

        return ret;
    }
}