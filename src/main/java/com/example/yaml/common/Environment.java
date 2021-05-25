
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
    "base",
    "default_attributes",
    "override_attributes"
})
@Generated("jsonschema2pojo")
public class Environment {

    @JsonProperty("base")
    private String base;
    @JsonProperty("default_attributes")
    private Object defaultAttributes;
    @JsonProperty("override_attributes")
    private Object overrideAttributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonProperty("default_attributes")
    public Object getDefaultAttributes() {
        return defaultAttributes;
    }

    @JsonProperty("default_attributes")
    public void setDefaultAttributes(Object defaultAttributes) {
        this.defaultAttributes = defaultAttributes;
    }

    @JsonProperty("override_attributes")
    public Object getOverrideAttributes() {
        return overrideAttributes;
    }

    @JsonProperty("override_attributes")
    public void setOverrideAttributes(Object overrideAttributes) {
        this.overrideAttributes = overrideAttributes;
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
        sb.append(Environment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("defaultAttributes");
        sb.append('=');
        sb.append(((this.defaultAttributes == null)?"<null>":this.defaultAttributes));
        sb.append(',');
        sb.append("overrideAttributes");
        sb.append('=');
        sb.append(((this.overrideAttributes == null)?"<null>":this.overrideAttributes));
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
        result = ((result* 31)+((this.defaultAttributes == null)? 0 :this.defaultAttributes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.overrideAttributes == null)? 0 :this.overrideAttributes.hashCode()));
        result = ((result* 31)+((this.base == null)? 0 :this.base.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Environment) == false) {
            return false;
        }
        Environment rhs = ((Environment) other);
        return (((((this.defaultAttributes == rhs.defaultAttributes)||((this.defaultAttributes!= null)&&this.defaultAttributes.equals(rhs.defaultAttributes)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.overrideAttributes == rhs.overrideAttributes)||((this.overrideAttributes!= null)&&this.overrideAttributes.equals(rhs.overrideAttributes))))&&((this.base == rhs.base)||((this.base!= null)&&this.base.equals(rhs.base))));
    }

}
