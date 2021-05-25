
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
    "database_node_name",
    "controller_node_name",
    "self_service_portal_node_name",
    "kvm_compute_node_names"
})
@Generated("jsonschema2pojo")
public class Topology {

    @JsonProperty("database_node_name")
    private String databaseNodeName;
    @JsonProperty("controller_node_name")
    private String controllerNodeName;
    @JsonProperty("self_service_portal_node_name")
    private String selfServicePortalNodeName;
    @JsonProperty("kvm_compute_node_names")
    private String kvmComputeNodeNames;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("database_node_name")
    public String getDatabaseNodeName() {
        return databaseNodeName;
    }

    @JsonProperty("database_node_name")
    public void setDatabaseNodeName(String databaseNodeName) {
        this.databaseNodeName = databaseNodeName;
    }

    @JsonProperty("controller_node_name")
    public String getControllerNodeName() {
        return controllerNodeName;
    }

    @JsonProperty("controller_node_name")
    public void setControllerNodeName(String controllerNodeName) {
        this.controllerNodeName = controllerNodeName;
    }

    @JsonProperty("self_service_portal_node_name")
    public String getSelfServicePortalNodeName() {
        return selfServicePortalNodeName;
    }

    @JsonProperty("self_service_portal_node_name")
    public void setSelfServicePortalNodeName(String selfServicePortalNodeName) {
        this.selfServicePortalNodeName = selfServicePortalNodeName;
    }

    @JsonProperty("kvm_compute_node_names")
    public String getKvmComputeNodeNames() {
        return kvmComputeNodeNames;
    }

    @JsonProperty("kvm_compute_node_names")
    public void setKvmComputeNodeNames(String kvmComputeNodeNames) {
        this.kvmComputeNodeNames = kvmComputeNodeNames;
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
        sb.append(Topology.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("databaseNodeName");
        sb.append('=');
        sb.append(((this.databaseNodeName == null)?"<null>":this.databaseNodeName));
        sb.append(',');
        sb.append("controllerNodeName");
        sb.append('=');
        sb.append(((this.controllerNodeName == null)?"<null>":this.controllerNodeName));
        sb.append(',');
        sb.append("selfServicePortalNodeName");
        sb.append('=');
        sb.append(((this.selfServicePortalNodeName == null)?"<null>":this.selfServicePortalNodeName));
        sb.append(',');
        sb.append("kvmComputeNodeNames");
        sb.append('=');
        sb.append(((this.kvmComputeNodeNames == null)?"<null>":this.kvmComputeNodeNames));
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
        result = ((result* 31)+((this.databaseNodeName == null)? 0 :this.databaseNodeName.hashCode()));
        result = ((result* 31)+((this.selfServicePortalNodeName == null)? 0 :this.selfServicePortalNodeName.hashCode()));
        result = ((result* 31)+((this.kvmComputeNodeNames == null)? 0 :this.kvmComputeNodeNames.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.controllerNodeName == null)? 0 :this.controllerNodeName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Topology) == false) {
            return false;
        }
        Topology rhs = ((Topology) other);
        return ((((((this.databaseNodeName == rhs.databaseNodeName)||((this.databaseNodeName!= null)&&this.databaseNodeName.equals(rhs.databaseNodeName)))&&((this.selfServicePortalNodeName == rhs.selfServicePortalNodeName)||((this.selfServicePortalNodeName!= null)&&this.selfServicePortalNodeName.equals(rhs.selfServicePortalNodeName))))&&((this.kvmComputeNodeNames == rhs.kvmComputeNodeNames)||((this.kvmComputeNodeNames!= null)&&this.kvmComputeNodeNames.equals(rhs.kvmComputeNodeNames))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.controllerNodeName == rhs.controllerNodeName)||((this.controllerNodeName!= null)&&this.controllerNodeName.equals(rhs.controllerNodeName))));
    }

}
