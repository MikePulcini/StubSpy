package org.pulcini.stubspy.client;

import org.pulcini.stubspy.model.BasicListing;
import org.pulcini.stubspy.model.ticketmasterresale.Offer;
import org.pulcini.stubspy.model.ticketmasterresale.TicketmasterResaleEventListings;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TicketmasterResaleClient {

    private static final String DEFAULT_BASE_URL = "https://offeradapter.ticketmaster.com";

    private Client client;
    private String apiKey;
    private String apiSecret;
    private String baseURL;


    public TicketmasterResaleClient(String apiKey, String apiSecret) {
        this(apiKey, apiSecret, DEFAULT_BASE_URL);
    }

    public TicketmasterResaleClient(String apiKey, String apiSecret, String baseURL) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.baseURL = baseURL;

        client = ClientBuilder.newClient();
    }

    public List<BasicListing> retrieveOffers(String eventId, Collection<String> sections) {
        TicketmasterResaleEventListings trel = client.target(baseURL)
                .path("/api/ismds/event/" + eventId + "/facets")
                .queryParam("by", "inventorytypes%20%2B%20offers")
                .queryParam("q", buildFilterString(sections))
                .queryParam("show", "places")
                .queryParam("embed", "offer")
                .queryParam("apikey", apiKey)
                .queryParam("apisecret", apiSecret)
                .request(MediaType.APPLICATION_JSON)
                .get(TicketmasterResaleEventListings.class);

        List<BasicListing> ret = new ArrayList<BasicListing>();
        for ( Offer o : trel.getEmbedded().getOffer() ) {
            ret.add(o);
        }

        return ret;
    }

    private String buildFilterString(Collection<String> sections) {

        // Final string should look like:         "and(inventorytypes%3A"resale"%2C%20or(section%3A"206"%2C%20section%3A"207"%2C%20section%3A"208"%2C%20section%3A"209"%2C%20section%3A"210"%2C%20section%3A"211"%2C%20section%3A"212"%2C%20section%3A"213"%2C%20section%3A"214"%2C%20section%3A"215"%2C%20section%3A"216"%2C%20section%3A"229"%2C%20section%3A"230"%2C%20section%3A"231"%2C%20section%3A"232"%2C%20section%3A"235"%2C%20section%3A"236"%2C%20section%3A"237"%2C%20section%3A"238"))    }

        if ( sections == null || sections.size() == 0 ) {
            throw new IllegalArgumentException("Sections cannot be null or empty");
        }

        String filter = "and(";
        filter += "inventorytypes%3A\"resale\"";
        filter += "%2C%20";

        filter += "or(";

        boolean firstSection = true;

        for ( String section : sections ) {
            if ( !firstSection ) {
                filter += "%2C%20";
            }

            firstSection = false;

            filter += "section%3A\"" + section + "\"";
        }

        filter += "))";

        return filter;
    }
}
