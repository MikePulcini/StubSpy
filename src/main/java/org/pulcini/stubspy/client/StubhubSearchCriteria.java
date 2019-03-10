package org.pulcini.stubspy.client;

import java.util.ArrayList;
import java.util.List;

public class StubhubSearchCriteria {
    private int quantity;
    private int eventId;
    public List<Integer> zoneIds = new ArrayList<Integer>();
    private List<Integer> sectionIds = new ArrayList<Integer>();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public List<Integer> getZoneIds() {
        return zoneIds;
    }

    public void setZoneIds(List<Integer> zoneIds) {
        this.zoneIds = zoneIds;
    }

    public List<Integer> getSectionIds() {
        return sectionIds;
    }

    public void setSectionIds(List<Integer> sectionIds) {
        this.sectionIds = sectionIds;
    }

    @Override
    public String toString() {
        return "StubhubSearchCriteria{" +
                "quantity=" + quantity +
                ", eventId=" + eventId +
                ", zoneIds=" + zoneIds +
                ", sectionIds=" + sectionIds +
                '}';
    }
}
