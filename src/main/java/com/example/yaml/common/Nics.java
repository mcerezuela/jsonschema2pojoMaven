
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
    "management_network",
    "data_network"
})
@Generated("jsonschema2pojo")
public class Nics {

    @JsonProperty("management_network")
    private String managementNetwork;
    @JsonProperty("data_network")
    private String dataNetwork;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("management_network")
    public String getManagementNetwork() {
        return managementNetwork;
    }

    @JsonProperty("management_network")
    public void setManagementNetwork(String managementNetwork) {
        this.managementNetwork = managementNetwork;
    }

    @JsonProperty("data_network")
    public String getDataNetwork() {
        return dataNetwork;
    }

    @JsonProperty("data_network")
    public void setDataNetwork(String dataNetwork) {
        this.dataNetwork = dataNetwork;
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
        sb.append(Nics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("managementNetwork");
        sb.append('=');
        sb.append(((this.managementNetwork == null)?"<null>":this.managementNetwork));
        sb.append(',');
        sb.append("dataNetwork");
        sb.append('=');
        sb.append(((this.dataNetwork == null)?"<null>":this.dataNetwork));
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
        result = ((result* 31)+((this.managementNetwork == null)? 0 :this.managementNetwork.hashCode()));
        result = ((result* 31)+((this.dataNetwork == null)? 0 :this.dataNetwork.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nics) == false) {
            return false;
        }
        Nics rhs = ((Nics) other);
        return ((((this.managementNetwork == rhs.managementNetwork)||((this.managementNetwork!= null)&&this.managementNetwork.equals(rhs.managementNetwork)))&&((this.dataNetwork == rhs.dataNetwork)||((this.dataNetwork!= null)&&this.dataNetwork.equals(rhs.dataNetwork))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
