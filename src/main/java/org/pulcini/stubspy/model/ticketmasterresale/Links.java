
package org.pulcini.stubspy.model.ticketmasterresale;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "event",
    "tickettype"
})
public class Links {

    @JsonProperty("self")
    private List<Self> self = null;
    @JsonProperty("event")
    private List<Event> event = null;
    @JsonProperty("tickettype")
    private List<Tickettype> tickettype = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("self")
    public List<Self> getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(List<Self> self) {
        this.self = self;
    }

    @JsonProperty("event")
    public List<Event> getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(List<Event> event) {
        this.event = event;
    }

    @JsonProperty("tickettype")
    public List<Tickettype> getTickettype() {
        return tickettype;
    }

    @JsonProperty("tickettype")
    public void setTickettype(List<Tickettype> tickettype) {
        this.tickettype = tickettype;
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
