
package com.example.yaml.common;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self_service_portal",
    "platform_resource_scheduler"
})
@Generated("jsonschema2pojo")
public class Features {

    @JsonProperty("self_service_portal")
    private String selfServicePortal;
    @JsonProperty("platform_resource_scheduler")
    private String platformResourceScheduler;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("self_service_portal")
    public String getSelfServicePortal() {
        return selfServicePortal;
    }

    @JsonProperty("self_service_portal")
    public void setSelfServicePortal(String selfServicePortal) {
        this.selfServicePortal = selfServicePortal;
    }

    @JsonProperty("platform_resource_scheduler")
    public String getPlatformResourceScheduler() {
        return platformResourceScheduler;
    }

    @JsonProperty("platform_resource_scheduler")
    public void setPlatformResourceScheduler(String platformResourceScheduler) {
        this.platformResourceScheduler = platformResourceScheduler;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Features.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("selfServicePortal");
        sb.append('=');
        sb.append(((this.selfServicePortal == null)?"<null>":this.selfServicePortal));
        sb.append(',');
        sb.append("platformResourceScheduler");
        sb.append('=');
        sb.append(((this.platformResourceScheduler == null)?"<null>":this.platformResourceScheduler));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.selfServicePortal == null)? 0 :this.selfServicePortal.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.platformResourceScheduler == null)? 0 :this.platformResourceScheduler.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Features) == false) {
            return false;
        }
        Features rhs = ((Features) other);
        return ((((this.selfServicePortal == rhs.selfServicePortal)||((this.selfServicePortal!= null)&&this.selfServicePortal.equals(rhs.selfServicePortal)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.platformResourceScheduler == rhs.platformResourceScheduler)||((this.platformResourceScheduler!= null)&&this.platformResourceScheduler.equals(rhs.platformResourceScheduler))));
    }

}
