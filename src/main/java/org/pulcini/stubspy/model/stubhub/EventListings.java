
package org.pulcini.stubspy.model.stubhub;

import com.fasterxml.jackson.annotation.*;

import jakarta.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "errors",
    "eventId",
    "totalListings",
    "totalTickets",
    "minQuantity",
    "maxQuantity",
    "mapDisplayType",
    "listing",
    "section_stats",
    "zone_stats",
    "pricingSummary",
    "listingAttributeCategorySummary",
    "deliveryTypeSummary",
    "start",
    "rows"
})
public class EventListings {

    @JsonProperty("errors")
    private Object errors;
    @JsonProperty("eventId")
    private Integer eventId;
    @JsonProperty("totalListings")
    private Integer totalListings;
    @JsonProperty("totalTickets")
    private Integer totalTickets;
    @JsonProperty("minQuantity")
    private Integer minQuantity;
    @JsonProperty("maxQuantity")
    private Integer maxQuantity;
    @JsonProperty("mapDisplayType")
    private String mapDisplayType;
    @JsonProperty("listing")
    private List<Listing> listing = new ArrayList<Listing>();
    @JsonProperty("section_stats")
    private Object sectionStats;
    @JsonProperty("zone_stats")
    private Object zoneStats;
    @JsonProperty("pricingSummary")
    private Object pricingSummary;
    @JsonProperty("listingAttributeCategorySummary")
    private List<Object> listingAttributeCategorySummary = new ArrayList<Object>();
    @JsonProperty("deliveryTypeSummary")
    private List<Object> deliveryTypeSummary = new ArrayList<Object>();
    @JsonProperty("start")
    private Integer start;
    @JsonProperty("rows")
    private Integer rows;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The errors
     */
    @JsonProperty("errors")
    public Object getErrors() {
        return errors;
    }

    /**
     * 
     * @param errors
     *     The errors
     */
    @JsonProperty("errors")
    public void setErrors(Object errors) {
        this.errors = errors;
    }

    /**
     * 
     * @return
     *     The eventId
     */
    @JsonProperty("eventId")
    public Integer getEventId() {
        return eventId;
    }

    /**
     * 
     * @param eventId
     *     The eventId
     */
    @JsonProperty("eventId")
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * 
     * @return
     *     The totalListings
     */
    @JsonProperty("totalListings")
    public Integer getTotalListings() {
        return totalListings;
    }

    /**
     * 
     * @param totalListings
     *     The totalListings
     */
    @JsonProperty("totalListings")
    public void setTotalListings(Integer totalListings) {
        this.totalListings = totalListings;
    }

    /**
     * 
     * @return
     *     The totalTickets
     */
    @JsonProperty("totalTickets")
    public Integer getTotalTickets() {
        return totalTickets;
    }

    /**
     * 
     * @param totalTickets
     *     The totalTickets
     */
    @JsonProperty("totalTickets")
    public void setTotalTickets(Integer totalTickets) {
        this.totalTickets = totalTickets;
    }

    /**
     * 
     * @return
     *     The minQuantity
     */
    @JsonProperty("minQuantity")
    public Integer getMinQuantity() {
        return minQuantity;
    }

    /**
     * 
     * @param minQuantity
     *     The minQuantity
     */
    @JsonProperty("minQuantity")
    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    /**
     * 
     * @return
     *     The maxQuantity
     */
    @JsonProperty("maxQuantity")
    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * 
     * @param maxQuantity
     *     The maxQuantity
     */
    @JsonProperty("maxQuantity")
    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    /**
     * 
     * @return
     *     The mapDisplayType
     */
    @JsonProperty("mapDisplayType")
    public String getMapDisplayType() {
        return mapDisplayType;
    }

    /**
     * 
     * @param mapDisplayType
     *     The mapDisplayType
     */
    @JsonProperty("mapDisplayType")
    public void setMapDisplayType(String mapDisplayType) {
        this.mapDisplayType = mapDisplayType;
    }

    /**
     * 
     * @return
     *     The listing
     */
    @JsonProperty("listing")
    public List<Listing> getListing() {
        return listing;
    }

    /**
     * 
     * @param listing
     *     The listing
     */
    @JsonProperty("listing")
    public void setListing(List<Listing> listing) {
        this.listing = listing;
    }

    /**
     * 
     * @return
     *     The sectionStats
     */
    @JsonProperty("section_stats")
    public Object getSectionStats() {
        return sectionStats;
    }

    /**
     * 
     * @param sectionStats
     *     The section_stats
     */
    @JsonProperty("section_stats")
    public void setSectionStats(Object sectionStats) {
        this.sectionStats = sectionStats;
    }

    /**
     * 
     * @return
     *     The zoneStats
     */
    @JsonProperty("zone_stats")
    public Object getZoneStats() {
        return zoneStats;
    }

    /**
     * 
     * @param zoneStats
     *     The zone_stats
     */
    @JsonProperty("zone_stats")
    public void setZoneStats(Object zoneStats) {
        this.zoneStats = zoneStats;
    }

    /**
     * 
     * @return
     *     The pricingSummary
     */
    @JsonProperty("pricingSummary")
    public Object getPricingSummary() {
        return pricingSummary;
    }

    /**
     * 
     * @param pricingSummary
     *     The pricingSummary
     */
    @JsonProperty("pricingSummary")
    public void setPricingSummary(Object pricingSummary) {
        this.pricingSummary = pricingSummary;
    }

    /**
     * 
     * @return
     *     The listingAttributeCategorySummary
     */
    @JsonProperty("listingAttributeCategorySummary")
    public List<Object> getListingAttributeCategorySummary() {
        return listingAttributeCategorySummary;
    }

    /**
     * 
     * @param listingAttributeCategorySummary
     *     The listingAttributeCategorySummary
     */
    @JsonProperty("listingAttributeCategorySummary")
    public void setListingAttributeCategorySummary(List<Object> listingAttributeCategorySummary) {
        this.listingAttributeCategorySummary = listingAttributeCategorySummary;
    }

    /**
     * 
     * @return
     *     The deliveryTypeSummary
     */
    @JsonProperty("deliveryTypeSummary")
    public List<Object> getDeliveryTypeSummary() {
        return deliveryTypeSummary;
    }

    /**
     * 
     * @param deliveryTypeSummary
     *     The deliveryTypeSummary
     */
    @JsonProperty("deliveryTypeSummary")
    public void setDeliveryTypeSummary(List<Object> deliveryTypeSummary) {
        this.deliveryTypeSummary = deliveryTypeSummary;
    }

    /**
     * 
     * @return
     *     The start
     */
    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 
     * @return
     *     The rows
     */
    @JsonProperty("rows")
    public Integer getRows() {
        return rows;
    }

    /**
     * 
     * @param rows
     *     The rows
     */
    @JsonProperty("rows")
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
