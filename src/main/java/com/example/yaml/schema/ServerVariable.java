
package com.example.yaml.schema;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enum",
    "default",
    "description"
})
@Generated("jsonschema2pojo")
public class ServerVariable {

    @JsonProperty("enum")
    private List<String> _enum = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default")
    private String _default;
    @JsonProperty("description")
    private String description;

    @JsonProperty("enum")
    public List<String> getEnum() {
        return _enum;
    }

    @JsonProperty("enum")
    public void setEnum(List<String> _enum) {
        this._enum = _enum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default")
    public String getDefault() {
        return _default;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default")
    public void setDefault(String _default) {
        this._default = _default;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerVariable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_enum");
        sb.append('=');
        sb.append(((this._enum == null)?"<null>":this._enum));
        sb.append(',');
        sb.append("_default");
        sb.append('=');
        sb.append(((this._default == null)?"<null>":this._default));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this._default == null)? 0 :this._default.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._enum == null)? 0 :this._enum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServerVariable) == false) {
            return false;
        }
        ServerVariable rhs = ((ServerVariable) other);
        return ((((this._default == rhs._default)||((this._default!= null)&&this._default.equals(rhs._default)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._enum == rhs._enum)||((this._enum!= null)&&this._enum.equals(rhs._enum))));
    }

}
