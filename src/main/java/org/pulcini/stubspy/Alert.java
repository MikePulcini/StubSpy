package org.pulcini.stubspy;

/**
 * Created by mike on 6/28/2016.
 */
public class Alert {
    private int eventId;
    private int zoneId;
    private double maxPrice;
    private boolean dailySummary;
    private boolean instantAlert;

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

    @Override
    public String toString() {
        return "Alert{" +
                "eventId=" + eventId +
                ", zoneId=" + zoneId +
                ", maxPrice=" + maxPrice +
                ", dailySummary=" + dailySummary +
                ", instantAlert=" + instantAlert +
                '}';
    }
}
