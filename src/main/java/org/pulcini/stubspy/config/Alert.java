package org.pulcini.stubspy.config;

import org.pulcini.stubspy.client.StubhubSearchCriteria;
import org.pulcini.stubspy.client.TicketmasterResaleSearchCriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mike on 6/28/2016.
 */
public class Alert {
    private int quantity;
    private double maxPrice;
    private boolean dailySummary;
    private boolean instantAlert;
    private String eventName;

    private Stubhub stubhub;
    private TicketmasterResale ticketmasterResale;

    public static class Stubhub {
        private int eventId;
        public List<Integer> zoneIds = new ArrayList<Integer>();
        private List<Integer> sectionIds = new ArrayList<Integer>();
        private boolean enabled;

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

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
    }

    public static class TicketmasterResale {
        private String eventId;
        private List<String> sections;
        public boolean enabled;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getEventId() {
            return eventId;
        }

        public void setEventId(String eventId) {
            this.eventId = eventId;
        }

        public List<String> getSections() {
            return sections;
        }

        public void setSections(List<String> sections) {
            this.sections = sections;
        }
    }

    public Stubhub getStubhub() {
        return stubhub;
    }

    public void setStubhub(Stubhub stubhub) {
        this.stubhub = stubhub;
    }

    public TicketmasterResale getTicketmasterResale() {
        return ticketmasterResale;
    }

    public void setTicketmasterResale(TicketmasterResale ticketmasterResale) {
        this.ticketmasterResale = ticketmasterResale;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<String> rows;

    public List<String> getRows() {
        return rows;
    }

    public void setRows(List<String> rows) {
        this.rows = rows;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public boolean isDailySummary() {
        return dailySummary;
    }

    public void setDailySummary(boolean dailySummary) {
        this.dailySummary = dailySummary;
    }

    public boolean isInstantAlert() {
        return instantAlert;
    }

    public void setInstantAlert(boolean instantAlert) {
        this.instantAlert = instantAlert;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public boolean isStubhubEnabled() {
        return this.stubhub != null && this.stubhub.isEnabled();
    }

    public StubhubSearchCriteria getStubhubSearchCriteria() {
        StubhubSearchCriteria sc = new StubhubSearchCriteria();
        sc.setEventId(this.getStubhub().getEventId());
        sc.setQuantity(this.getQuantity());
        sc.setSectionIds(this.getStubhub().getSectionIds());
        sc.setZoneIds(this.getStubhub().getZoneIds());
        return sc;
    }

    public boolean isTicketmasterResaleEnabled() {
        return this.ticketmasterResale != null && this.ticketmasterResale.isEnabled();
    }

    public TicketmasterResaleSearchCriteria getTicketmasterResaleSearchCriteria() {
        TicketmasterResaleSearchCriteria sc = new TicketmasterResaleSearchCriteria();
        sc.setEventId(this.getTicketmasterResale().getEventId());
        sc.setSections(this.getTicketmasterResale().getSections());
        return sc;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "eventId=" + stubhub.getEventId() +
                ", maxPrice=" + maxPrice +
                ", dailySummary=" + dailySummary +
                ", instantAlert=" + instantAlert +
                '}';
    }
}
