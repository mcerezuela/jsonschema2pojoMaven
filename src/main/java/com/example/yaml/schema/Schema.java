
package com.example.yaml.schema;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Validation schema for OpenAPI Specification 3.0.X.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "openapi",
    "info",
    "externalDocs",
    "servers",
    "security",
    "tags",
    "paths",
    "components"
})
@Generated("jsonschema2pojo")
public class Schema {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openapi")
    private String openapi;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Info info;
    @JsonProperty("externalDocs")
    private ExternalDocumentation externalDocs;
    @JsonProperty("servers")
    private List<Server> servers = new ArrayList<Server>();
    @JsonProperty("security")
    private List<SecurityRequirement> security = new ArrayList<SecurityRequirement>();
    @JsonProperty("tags")
    @JsonDeserialize(as = LinkedHashSet.class)
    private Set<Tag> tags = new LinkedHashSet<Tag>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("paths")
    private Paths paths;
    @JsonProperty("components")
    private Components components;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openapi")
    public String getOpenapi() {
        return openapi;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openapi")
    public void setOpenapi(String openapi) {
        this.openapi = openapi;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("externalDocs")
    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    @JsonProperty("externalDocs")
    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    @JsonProperty("servers")
    public List<Server> getServers() {
        return servers;
    }

    @JsonProperty("servers")
    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    @JsonProperty("security")
    public List<SecurityRequirement> getSecurity() {
        return security;
    }

    @JsonProperty("security")
    public void setSecurity(List<SecurityRequirement> security) {
        this.security = security;
    }

    @JsonProperty("tags")
    public Set<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("paths")
    public Paths getPaths() {
        return paths;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("paths")
    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    @JsonProperty("components")
    public Components getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(Components components) {
        this.components = components;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Schema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("openapi");
        sb.append('=');
        sb.append(((this.openapi == null)?"<null>":this.openapi));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("externalDocs");
        sb.append('=');
        sb.append(((this.externalDocs == null)?"<null>":this.externalDocs));
        sb.append(',');
        sb.append("servers");
        sb.append('=');
        sb.append(((this.servers == null)?"<null>":this.servers));
        sb.append(',');
        sb.append("security");
        sb.append('=');
        sb.append(((this.security == null)?"<null>":this.security));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("paths");
        sb.append('=');
        sb.append(((this.paths == null)?"<null>":this.paths));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
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
        result = ((result* 31)+((this.security == null)? 0 :this.security.hashCode()));
        result = ((result* 31)+((this.components == null)? 0 :this.components.hashCode()));
        result = ((result* 31)+((this.servers == null)? 0 :this.servers.hashCode()));
        result = ((result* 31)+((this.openapi == null)? 0 :this.openapi.hashCode()));
        result = ((result* 31)+((this.paths == null)? 0 :this.paths.hashCode()));
        result = ((result* 31)+((this.externalDocs == null)? 0 :this.externalDocs.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schema) == false) {
            return false;
        }
        Schema rhs = ((Schema) other);
        return (((((((((this.security == rhs.security)||((this.security!= null)&&this.security.equals(rhs.security)))&&((this.components == rhs.components)||((this.components!= null)&&this.components.equals(rhs.components))))&&((this.servers == rhs.servers)||((this.servers!= null)&&this.servers.equals(rhs.servers))))&&((this.openapi == rhs.openapi)||((this.openapi!= null)&&this.openapi.equals(rhs.openapi))))&&((this.paths == rhs.paths)||((this.paths!= null)&&this.paths.equals(rhs.paths))))&&((this.externalDocs == rhs.externalDocs)||((this.externalDocs!= null)&&this.externalDocs.equals(rhs.externalDocs))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
