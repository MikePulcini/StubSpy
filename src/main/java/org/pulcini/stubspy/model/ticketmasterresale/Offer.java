
package org.pulcini.stubspy.model.ticketmasterresale;

import com.fasterxml.jackson.annotation.*;
import org.pulcini.stubspy.model.BasicListing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "schema",
    "meta",
    "offerId",
    "rank",
    "online",
    "protected",
    "rollup",
    "inventoryType",
    "offerType",
    "listingId",
    "listingVersionId",
    "currency",
    "listPrice",
    "faceValue",
    "totalPrice",
    "noChargesPrice",
    "charges",
    "sellableQuantities",
    "section",
    "row",
    "seatFrom",
    "seatTo",
    "alternateIds",
    "ticketTypeId",
    "deliveries",
    "_links"
})
public class Offer implements BasicListing {

    @JsonProperty("schema")
    private String schema;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("offerId")
    private String offerId;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("online")
    private Boolean online;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("rollup")
    private Boolean rollup;
    @JsonProperty("inventoryType")
    private String inventoryType;
    @JsonProperty("offerType")
    private String offerType;
    @JsonProperty("listingId")
    private String listingId;
    @JsonProperty("listingVersionId")
    private String listingVersionId;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("listPrice")
    private Integer listPrice;
    @JsonProperty("faceValue")
    private Integer faceValue;
    @JsonProperty("totalPrice")
    private Double totalPrice;
    @JsonProperty("noChargesPrice")
    private Integer noChargesPrice;
    @JsonProperty("charges")
    private List<Charge> charges = null;
    @JsonProperty("sellableQuantities")
    private List<Integer> sellableQuantities = null;
    @JsonProperty("section")
    private String section;
    @JsonProperty("row")
    private String row;
    @JsonProperty("seatFrom")
    private String seatFrom;
    @JsonProperty("seatTo")
    private String seatTo;
    @JsonProperty("alternateIds")
    private List<AlternateId> alternateIds = null;
    @JsonProperty("ticketTypeId")
    private String ticketTypeId;
    @JsonProperty("deliveries")
    private List<Object> deliveries = null;
    @JsonProperty("_links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("offerId")
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty("offerId")
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("online")
    public Boolean getOnline() {
        return online;
    }

    @JsonProperty("online")
    public void setOnline(Boolean online) {
        this.online = online;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @JsonProperty("rollup")
    public Boolean getRollup() {
        return rollup;
    }

    @JsonProperty("rollup")
    public void setRollup(Boolean rollup) {
        this.rollup = rollup;
    }

    @JsonProperty("inventoryType")
    public String getInventoryType() {
        return inventoryType;
    }

    @JsonProperty("inventoryType")
    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    @JsonProperty("offerType")
    public String getOfferType() {
        return offerType;
    }

    @JsonProperty("offerType")
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    @JsonProperty("listingId")
    public String getListingId() {
        return listingId;
    }

    @JsonProperty("listingId")
    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    @JsonProperty("listingVersionId")
    public String getListingVersionId() {
        return listingVersionId;
    }

    @JsonProperty("listingVersionId")
    public void setListingVersionId(String listingVersionId) {
        this.listingVersionId = listingVersionId;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("listPrice")
    public Integer getListPrice() {
        return listPrice;
    }

    @JsonProperty("listPrice")
    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("faceValue")
    public Integer getFaceValue() {
        return faceValue;
    }

    @JsonProperty("faceValue")
    public void setFaceValue(Integer faceValue) {
        this.faceValue = faceValue;
    }

    @JsonProperty("totalPrice")
    public Double getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("totalPrice")
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("noChargesPrice")
    public Integer getNoChargesPrice() {
        return noChargesPrice;
    }

    @JsonProperty("noChargesPrice")
    public void setNoChargesPrice(Integer noChargesPrice) {
        this.noChargesPrice = noChargesPrice;
    }

    @JsonProperty("charges")
    public List<Charge> getCharges() {
        return charges;
    }

    @JsonProperty("charges")
    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }

    @JsonProperty("sellableQuantities")
    public List<Integer> getSellableQuantities() {
        return sellableQuantities;
    }

    @JsonProperty("sellableQuantities")
    public void setSellableQuantities(List<Integer> sellableQuantities) {
        this.sellableQuantities = sellableQuantities;
    }

    @JsonProperty("section")
    public String getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(String section) {
        this.section = section;
    }

    @JsonProperty("row")
    public String getRow() {
        return row;
    }

    @JsonProperty("row")
    public void setRow(String row) {
        this.row = row;
    }

    @JsonProperty("seatFrom")
    public String getSeatFrom() {
        return seatFrom;
    }

    @JsonProperty("seatFrom")
    public void setSeatFrom(String seatFrom) {
        this.seatFrom = seatFrom;
    }

    @JsonProperty("seatTo")
    public String getSeatTo() {
        return seatTo;
    }

    @JsonProperty("seatTo")
    public void setSeatTo(String seatTo) {
        this.seatTo = seatTo;
    }

    @JsonProperty("alternateIds")
    public List<AlternateId> getAlternateIds() {
        return alternateIds;
    }

    @JsonProperty("alternateIds")
    public void setAlternateIds(List<AlternateId> alternateIds) {
        this.alternateIds = alternateIds;
    }

    @JsonProperty("ticketTypeId")
    public String getTicketTypeId() {
        return ticketTypeId;
    }

    @JsonProperty("ticketTypeId")
    public void setTicketTypeId(String ticketTypeId) {
        this.ticketTypeId = ticketTypeId;
    }

    @JsonProperty("deliveries")
    public List<Object> getDeliveries() {
        return deliveries;
    }

    @JsonProperty("deliveries")
    public void setDeliveries(List<Object> deliveries) {
        this.deliveries = deliveries;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String getBasicListingId() {
        return getListingId();
    }

    @Override
    public String getBasicSection() {
        return getSection();
    }

    @Override
    public Double getBasicTotalCost() {
        return getTotalPrice();
    }

    @Override
    public String getBasicRow() {
        return getRow();
    }

    @Override
    public String getBasicSource() {
        return "Ticketmaster Resale";
    }

    @Override
    public String getBasicSeatNumbers() {
        return getSeatFrom() + "-" + getSeatTo();
    }
}
