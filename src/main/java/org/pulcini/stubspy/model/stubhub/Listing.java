
package org.pulcini.stubspy.model.stubhub;

import com.fasterxml.jackson.annotation.*;
import org.pulcini.stubspy.model.BasicListing;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "listingId",
    "currentPrice",
    "sectionId",
    "row",
    "quantity",
    "sellerSectionName",
    "sectionName",
    "seatNumbers",
    "zoneId",
    "zoneName",
    "listingAttributeList",
    "listingAttributeCategoryList",
    "deliveryTypeList",
    "ticketClass",
    "dirtyTicketInd",
    "splitOption",
    "ticketSplit",
    "splitVector",
    "sellerOwnInd",
    "faceValue",
    "serviceFee",
    "deliveryFee",
    "totalCost",
    "score"
})
public class Listing implements BasicListing {

    @JsonProperty("listingId")
    private Integer listingId;
    @JsonProperty("currentPrice")
    private CurrentPrice currentPrice;
    @JsonProperty("sectionId")
    private Integer sectionId;
    @JsonProperty("row")
    private String row;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("sellerSectionName")
    private String sellerSectionName;
    @JsonProperty("sectionName")
    private String sectionName;
    @JsonProperty("seatNumbers")
    private String seatNumbers;
    @JsonProperty("zoneId")
    private Integer zoneId;
    @JsonProperty("zoneName")
    private String zoneName;
    @JsonProperty("listingAttributeList")
    private Object listingAttributeList;
    @JsonProperty("listingAttributeCategoryList")
    private Object listingAttributeCategoryList;
    @JsonProperty("deliveryTypeList")
    private List<Integer> deliveryTypeList = new ArrayList<Integer>();
    @JsonProperty("ticketClass")
    private Object ticketClass;
    @JsonProperty("dirtyTicketInd")
    private Boolean dirtyTicketInd;
    @JsonProperty("splitOption")
    private String splitOption;
    @JsonProperty("ticketSplit")
    private String ticketSplit;
    @JsonProperty("splitVector")
    private List<Integer> splitVector = new ArrayList<Integer>();
    @JsonProperty("sellerOwnInd")
    private Integer sellerOwnInd;
    @JsonProperty("faceValue")
    private Object faceValue;
    @JsonProperty("serviceFee")
    private Object serviceFee;
    @JsonProperty("deliveryFee")
    private Object deliveryFee;
    @JsonProperty("totalCost")
    private Object totalCost;
    @JsonProperty("score")
    private Double score;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The listingId
     */
    @JsonProperty("listingId")
    public Integer getListingId() {
        return listingId;
    }

    /**
     * 
     * @param listingId
     *     The listingId
     */
    @JsonProperty("listingId")
    public void setListingId(Integer listingId) {
        this.listingId = listingId;
    }

    /**
     * 
     * @return
     *     The currentPrice
     */
    @JsonProperty("currentPrice")
    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    /**
     * 
     * @param currentPrice
     *     The currentPrice
     */
    @JsonProperty("currentPrice")
    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * 
     * @return
     *     The sectionId
     */
    @JsonProperty("sectionId")
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * 
     * @param sectionId
     *     The sectionId
     */
    @JsonProperty("sectionId")
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 
     * @return
     *     The row
     */
    @JsonProperty("row")
    public String getRow() {
        return row;
    }

    /**
     * 
     * @param row
     *     The row
     */
    @JsonProperty("row")
    public void setRow(String row) {
        this.row = row;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The sellerSectionName
     */
    @JsonProperty("sellerSectionName")
    public String getSellerSectionName() {
        return sellerSectionName;
    }

    /**
     * 
     * @param sellerSectionName
     *     The sellerSectionName
     */
    @JsonProperty("sellerSectionName")
    public void setSellerSectionName(String sellerSectionName) {
        this.sellerSectionName = sellerSectionName;
    }

    /**
     * 
     * @return
     *     The sectionName
     */
    @JsonProperty("sectionName")
    public String getSectionName() {
        return sectionName;
    }

    /**
     * 
     * @param sectionName
     *     The sectionName
     */
    @JsonProperty("sectionName")
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    /**
     * 
     * @return
     *     The seatNumbers
     */
    @JsonProperty("seatNumbers")
    public String getSeatNumbers() {
        return seatNumbers;
    }

    /**
     * 
     * @param seatNumbers
     *     The seatNumbers
     */
    @JsonProperty("seatNumbers")
    public void setSeatNumbers(String seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    /**
     * 
     * @return
     *     The zoneId
     */
    @JsonProperty("zoneId")
    public Integer getZoneId() {
        return zoneId;
    }

    /**
     * 
     * @param zoneId
     *     The zoneId
     */
    @JsonProperty("zoneId")
    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * 
     * @return
     *     The zoneName
     */
    @JsonProperty("zoneName")
    public String getZoneName() {
        return zoneName;
    }

    /**
     * 
     * @param zoneName
     *     The zoneName
     */
    @JsonProperty("zoneName")
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     * 
     * @return
     *     The listingAttributeList
     */
    @JsonProperty("listingAttributeList")
    public Object getListingAttributeList() {
        return listingAttributeList;
    }

    /**
     * 
     * @param listingAttributeList
     *     The listingAttributeList
     */
    @JsonProperty("listingAttributeList")
    public void setListingAttributeList(Object listingAttributeList) {
        this.listingAttributeList = listingAttributeList;
    }

    /**
     * 
     * @return
     *     The listingAttributeCategoryList
     */
    @JsonProperty("listingAttributeCategoryList")
    public Object getListingAttributeCategoryList() {
        return listingAttributeCategoryList;
    }

    /**
     * 
     * @param listingAttributeCategoryList
     *     The listingAttributeCategoryList
     */
    @JsonProperty("listingAttributeCategoryList")
    public void setListingAttributeCategoryList(Object listingAttributeCategoryList) {
        this.listingAttributeCategoryList = listingAttributeCategoryList;
    }

    /**
     * 
     * @return
     *     The deliveryTypeList
     */
    @JsonProperty("deliveryTypeList")
    public List<Integer> getDeliveryTypeList() {
        return deliveryTypeList;
    }

    /**
     * 
     * @param deliveryTypeList
     *     The deliveryTypeList
     */
    @JsonProperty("deliveryTypeList")
    public void setDeliveryTypeList(List<Integer> deliveryTypeList) {
        this.deliveryTypeList = deliveryTypeList;
    }

    /**
     * 
     * @return
     *     The ticketClass
     */
    @JsonProperty("ticketClass")
    public Object getTicketClass() {
        return ticketClass;
    }

    /**
     * 
     * @param ticketClass
     *     The ticketClass
     */
    @JsonProperty("ticketClass")
    public void setTicketClass(Object ticketClass) {
        this.ticketClass = ticketClass;
    }

    /**
     * 
     * @return
     *     The dirtyTicketInd
     */
    @JsonProperty("dirtyTicketInd")
    public Boolean getDirtyTicketInd() {
        return dirtyTicketInd;
    }

    /**
     * 
     * @param dirtyTicketInd
     *     The dirtyTicketInd
     */
    @JsonProperty("dirtyTicketInd")
    public void setDirtyTicketInd(Boolean dirtyTicketInd) {
        this.dirtyTicketInd = dirtyTicketInd;
    }

    /**
     * 
     * @return
     *     The splitOption
     */
    @JsonProperty("splitOption")
    public String getSplitOption() {
        return splitOption;
    }

    /**
     * 
     * @param splitOption
     *     The splitOption
     */
    @JsonProperty("splitOption")
    public void setSplitOption(String splitOption) {
        this.splitOption = splitOption;
    }

    /**
     * 
     * @return
     *     The ticketSplit
     */
    @JsonProperty("ticketSplit")
    public String getTicketSplit() {
        return ticketSplit;
    }

    /**
     * 
     * @param ticketSplit
     *     The ticketSplit
     */
    @JsonProperty("ticketSplit")
    public void setTicketSplit(String ticketSplit) {
        this.ticketSplit = ticketSplit;
    }

    /**
     * 
     * @return
     *     The splitVector
     */
    @JsonProperty("splitVector")
    public List<Integer> getSplitVector() {
        return splitVector;
    }

    /**
     * 
     * @param splitVector
     *     The splitVector
     */
    @JsonProperty("splitVector")
    public void setSplitVector(List<Integer> splitVector) {
        this.splitVector = splitVector;
    }

    /**
     * 
     * @return
     *     The sellerOwnInd
     */
    @JsonProperty("sellerOwnInd")
    public Integer getSellerOwnInd() {
        return sellerOwnInd;
    }

    /**
     * 
     * @param sellerOwnInd
     *     The sellerOwnInd
     */
    @JsonProperty("sellerOwnInd")
    public void setSellerOwnInd(Integer sellerOwnInd) {
        this.sellerOwnInd = sellerOwnInd;
    }

    /**
     * 
     * @return
     *     The faceValue
     */
    @JsonProperty("faceValue")
    public Object getFaceValue() {
        return faceValue;
    }

    /**
     * 
     * @param faceValue
     *     The faceValue
     */
    @JsonProperty("faceValue")
    public void setFaceValue(Object faceValue) {
        this.faceValue = faceValue;
    }

    /**
     * 
     * @return
     *     The serviceFee
     */
    @JsonProperty("serviceFee")
    public Object getServiceFee() {
        return serviceFee;
    }

    /**
     * 
     * @param serviceFee
     *     The serviceFee
     */
    @JsonProperty("serviceFee")
    public void setServiceFee(Object serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * 
     * @return
     *     The deliveryFee
     */
    @JsonProperty("deliveryFee")
    public Object getDeliveryFee() {
        return deliveryFee;
    }

    /**
     * 
     * @param deliveryFee
     *     The deliveryFee
     */
    @JsonProperty("deliveryFee")
    public void setDeliveryFee(Object deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    /**
     * 
     * @return
     *     The totalCost
     */
    @JsonProperty("totalCost")
    public Object getTotalCost() {
        return totalCost;
    }

    /**
     * 
     * @param totalCost
     *     The totalCost
     */
    @JsonProperty("totalCost")
    public void setTotalCost(Object totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 
     * @return
     *     The score
     */
    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
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
        return this.getListingId().toString();
    }

    @Override
    public String getBasicSection() {
        return this.getSectionName();
    }

    @Override
    public Double getBasicTotalCost() {
        return this.getCurrentPrice().getAmount();
    }

    @Override
    public String getBasicRow() {
        return this.getRow();
    }

    @Override
    public String getBasicSeatNumbers() {
        return this.getSeatNumbers();
    }

    @Override
    public String getBasicSource() {
        return "Stubhub";
    }
}
