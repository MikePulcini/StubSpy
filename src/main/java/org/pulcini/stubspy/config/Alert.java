package org.pulcini.stubspy.config;

import java.util.List;

/**
 * Created by mike on 6/28/2016.
 */
public class Alert {
//    private int eventId;
//    private int zoneId;
    private int quantity;
    private double maxPrice;
    private boolean dailySummary;
    private boolean instantAlert;
    private String eventName;

    private Stubhub stubhub;
    private TicketmasterResale ticketmasterResale;

    public static class Stubhub {
        private int eventId;
        private int zoneId;
        private boolean enabled;

        public int getEventId() {
            return eventId;
        }

        public void setEventId(int eventId) {
            this.eventId = eventId;
        }

        public int getZoneId() {
            return zoneId;
        }

        public void setZoneId(int zoneId) {
            this.zoneId = zoneId;
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
//
//    public int getEventId() {
//        return eventId;
//    }
//
//    public void setEventId(int eventId) {
//        this.eventId = eventId;
//    }
//
//    public int getZoneId() {
//        return zoneId;
//    }
//
//    public void setZoneId(int zoneId) {
//        this.zoneId = zoneId;
//    }

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

    @Override
    public String toString() {
        return "Alert{" +
                "eventId=" + stubhub.getEventId() +
                ", zoneId=" + stubhub.getZoneId() +
                ", maxPrice=" + maxPrice +
                ", dailySummary=" + dailySummary +
                ", instantAlert=" + instantAlert +
                '}';
    }
}
