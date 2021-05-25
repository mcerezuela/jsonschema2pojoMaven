
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
    "fqdn",
    "password",
    "identity_file",
    "nics",
    "attribute_file"
})
@Generated("jsonschema2pojo")
public class Node {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("fqdn")
    private String fqdn;
    @JsonProperty("password")
    private Object password;
    @JsonProperty("identity_file")
    private String identityFile;
    @JsonProperty("nics")
    private Nics nics;
    @JsonProperty("attribute_file")
    private Object attributeFile;
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

    @JsonProperty("fqdn")
    public String getFqdn() {
        return fqdn;
    }

    @JsonProperty("fqdn")
    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    @JsonProperty("password")
    public Object getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(Object password) {
        this.password = password;
    }

    @JsonProperty("identity_file")
    public String getIdentityFile() {
        return identityFile;
    }

    @JsonProperty("identity_file")
    public void setIdentityFile(String identityFile) {
        this.identityFile = identityFile;
    }

    @JsonProperty("nics")
    public Nics getNics() {
        return nics;
    }

    @JsonProperty("nics")
    public void setNics(Nics nics) {
        this.nics = nics;
    }

    @JsonProperty("attribute_file")
    public Object getAttributeFile() {
        return attributeFile;
    }

    @JsonProperty("attribute_file")
    public void setAttributeFile(Object attributeFile) {
        this.attributeFile = attributeFile;
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
        sb.append(Node.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("fqdn");
        sb.append('=');
        sb.append(((this.fqdn == null)?"<null>":this.fqdn));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("identityFile");
        sb.append('=');
        sb.append(((this.identityFile == null)?"<null>":this.identityFile));
        sb.append(',');
        sb.append("nics");
        sb.append('=');
        sb.append(((this.nics == null)?"<null>":this.nics));
        sb.append(',');
        sb.append("attributeFile");
        sb.append('=');
        sb.append(((this.attributeFile == null)?"<null>":this.attributeFile));
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
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.attributeFile == null)? 0 :this.attributeFile.hashCode()));
        result = ((result* 31)+((this.fqdn == null)? 0 :this.fqdn.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.nics == null)? 0 :this.nics.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.identityFile == null)? 0 :this.identityFile.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Node) == false) {
            return false;
        }
        Node rhs = ((Node) other);
        return (((((((((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password)))&&((this.attributeFile == rhs.attributeFile)||((this.attributeFile!= null)&&this.attributeFile.equals(rhs.attributeFile))))&&((this.fqdn == rhs.fqdn)||((this.fqdn!= null)&&this.fqdn.equals(rhs.fqdn))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.nics == rhs.nics)||((this.nics!= null)&&this.nics.equals(rhs.nics))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.identityFile == rhs.identityFile)||((this.identityFile!= null)&&this.identityFile.equals(rhs.identityFile))));
    }

}
