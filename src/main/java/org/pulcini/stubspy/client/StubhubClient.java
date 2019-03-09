package org.pulcini.stubspy.client;

import org.apache.commons.lang3.StringUtils;
import org.pulcini.stubspy.model.BasicListing;
import org.pulcini.stubspy.model.stubhub.Event;
import org.pulcini.stubspy.model.stubhub.EventListings;
import org.pulcini.stubspy.model.stubhub.Listing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@ConditionalOnProperty(name = "stubhub.token")
public class StubhubClient {

    private static final Logger logger = LoggerFactory.getLogger(StubhubClient.class);

    private Client client;

    @Value("${stubhub.token}")
    private String token;

    @Value("${stubhub.baseURL:https://api.stubhub.com}")
    private String baseURL;

    @PostConstruct
    private void init() {
        logger.info("Initializing StubhubClient...");
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
