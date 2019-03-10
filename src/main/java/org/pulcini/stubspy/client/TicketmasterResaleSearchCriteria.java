package org.pulcini.stubspy.client;

import java.util.List;

public class TicketmasterResaleSearchCriteria {
    private String eventId;
    private List<String> sections;

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

    @Override
    public String toString() {
        return "TicketmasterResaleSearchCriteria{" +
                "eventId='" + eventId + '\'' +
                ", sections=" + sections +
                '}';
    }
}
