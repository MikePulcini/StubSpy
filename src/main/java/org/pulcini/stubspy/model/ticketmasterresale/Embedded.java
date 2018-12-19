
package org.pulcini.stubspy.model.ticketmasterresale;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offer"
})
public class Embedded {

    @JsonProperty("offer")
    private List<Offer> offer = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("offer")
    public List<Offer> getOffer() {
        return offer;
    }

    @JsonProperty("offer")
    public void setOffer(List<Offer> offer) {
        this.offer = offer;
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
