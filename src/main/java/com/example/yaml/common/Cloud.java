
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
    "name",
    "description",
    "password",
    "database_service_type",
    "messaging_service_type",
    "features",
    "topology"
})
@Generated("jsonschema2pojo")
public class Cloud {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("password")
    private String password;
    @JsonProperty("database_service_type")
    private String databaseServiceType;
    @JsonProperty("messaging_service_type")
    private String messagingServiceType;
    @JsonProperty("features")
    private Features features;
    @JsonProperty("topology")
    private Topology topology;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("database_service_type")
    public String getDatabaseServiceType() {
        return databaseServiceType;
    }

    @JsonProperty("database_service_type")
    public void setDatabaseServiceType(String databaseServiceType) {
        this.databaseServiceType = databaseServiceType;
    }

    @JsonProperty("messaging_service_type")
    public String getMessagingServiceType() {
        return messagingServiceType;
    }

    @JsonProperty("messaging_service_type")
    public void setMessagingServiceType(String messagingServiceType) {
        this.messagingServiceType = messagingServiceType;
    }

    @JsonProperty("features")
    public Features getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(Features features) {
        this.features = features;
    }

    @JsonProperty("topology")
    public Topology getTopology() {
        return topology;
    }

    @JsonProperty("topology")
    public void setTopology(Topology topology) {
        this.topology = topology;
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
        sb.append(Cloud.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("databaseServiceType");
        sb.append('=');
        sb.append(((this.databaseServiceType == null)?"<null>":this.databaseServiceType));
        sb.append(',');
        sb.append("messagingServiceType");
        sb.append('=');
        sb.append(((this.messagingServiceType == null)?"<null>":this.messagingServiceType));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("topology");
        sb.append('=');
        sb.append(((this.topology == null)?"<null>":this.topology));
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
        result = ((result* 31)+((this.databaseServiceType == null)? 0 :this.databaseServiceType.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.topology == null)? 0 :this.topology.hashCode()));
        result = ((result* 31)+((this.messagingServiceType == null)? 0 :this.messagingServiceType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cloud) == false) {
            return false;
        }
        Cloud rhs = ((Cloud) other);
        return (((((((((this.databaseServiceType == rhs.databaseServiceType)||((this.databaseServiceType!= null)&&this.databaseServiceType.equals(rhs.databaseServiceType)))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.topology == rhs.topology)||((this.topology!= null)&&this.topology.equals(rhs.topology))))&&((this.messagingServiceType == rhs.messagingServiceType)||((this.messagingServiceType!= null)&&this.messagingServiceType.equals(rhs.messagingServiceType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
