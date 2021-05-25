
package com.example.yaml.schema;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "schemas",
    "responses",
    "parameters",
    "examples",
    "requestBodies",
    "headers",
    "securitySchemes",
    "links",
    "callbacks"
})
@Generated("jsonschema2pojo")
public class Components {

    @JsonProperty("schemas")
    private Schemas schemas;
    @JsonProperty("responses")
    private Responses responses;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("examples")
    private Examples examples;
    @JsonProperty("requestBodies")
    private RequestBodies requestBodies;
    @JsonProperty("headers")
    private Headers headers;
    @JsonProperty("securitySchemes")
    private SecuritySchemes securitySchemes;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("callbacks")
    private Callbacks callbacks;

    @JsonProperty("schemas")
    public Schemas getSchemas() {
        return schemas;
    }

    @JsonProperty("schemas")
    public void setSchemas(Schemas schemas) {
        this.schemas = schemas;
    }

    @JsonProperty("responses")
    public Responses getResponses() {
        return responses;
    }

    @JsonProperty("responses")
    public void setResponses(Responses responses) {
        this.responses = responses;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("examples")
    public Examples getExamples() {
        return examples;
    }

    @JsonProperty("examples")
    public void setExamples(Examples examples) {
        this.examples = examples;
    }

    @JsonProperty("requestBodies")
    public RequestBodies getRequestBodies() {
        return requestBodies;
    }

    @JsonProperty("requestBodies")
    public void setRequestBodies(RequestBodies requestBodies) {
        this.requestBodies = requestBodies;
    }

    @JsonProperty("headers")
    public Headers getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    @JsonProperty("securitySchemes")
    public SecuritySchemes getSecuritySchemes() {
        return securitySchemes;
    }

    @JsonProperty("securitySchemes")
    public void setSecuritySchemes(SecuritySchemes securitySchemes) {
        this.securitySchemes = securitySchemes;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("callbacks")
    public Callbacks getCallbacks() {
        return callbacks;
    }

    @JsonProperty("callbacks")
    public void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Components.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schemas");
        sb.append('=');
        sb.append(((this.schemas == null)?"<null>":this.schemas));
        sb.append(',');
        sb.append("responses");
        sb.append('=');
        sb.append(((this.responses == null)?"<null>":this.responses));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("examples");
        sb.append('=');
        sb.append(((this.examples == null)?"<null>":this.examples));
        sb.append(',');
        sb.append("requestBodies");
        sb.append('=');
        sb.append(((this.requestBodies == null)?"<null>":this.requestBodies));
        sb.append(',');
        sb.append("headers");
        sb.append('=');
        sb.append(((this.headers == null)?"<null>":this.headers));
        sb.append(',');
        sb.append("securitySchemes");
        sb.append('=');
        sb.append(((this.securitySchemes == null)?"<null>":this.securitySchemes));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("callbacks");
        sb.append('=');
        sb.append(((this.callbacks == null)?"<null>":this.callbacks));
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
        result = ((result* 31)+((this.headers == null)? 0 :this.headers.hashCode()));
        result = ((result* 31)+((this.examples == null)? 0 :this.examples.hashCode()));
        result = ((result* 31)+((this.schemas == null)? 0 :this.schemas.hashCode()));
        result = ((result* 31)+((this.requestBodies == null)? 0 :this.requestBodies.hashCode()));
        result = ((result* 31)+((this.responses == null)? 0 :this.responses.hashCode()));
        result = ((result* 31)+((this.callbacks == null)? 0 :this.callbacks.hashCode()));
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.securitySchemes == null)? 0 :this.securitySchemes.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Components) == false) {
            return false;
        }
        Components rhs = ((Components) other);
        return ((((((((((this.headers == rhs.headers)||((this.headers!= null)&&this.headers.equals(rhs.headers)))&&((this.examples == rhs.examples)||((this.examples!= null)&&this.examples.equals(rhs.examples))))&&((this.schemas == rhs.schemas)||((this.schemas!= null)&&this.schemas.equals(rhs.schemas))))&&((this.requestBodies == rhs.requestBodies)||((this.requestBodies!= null)&&this.requestBodies.equals(rhs.requestBodies))))&&((this.responses == rhs.responses)||((this.responses!= null)&&this.responses.equals(rhs.responses))))&&((this.callbacks == rhs.callbacks)||((this.callbacks!= null)&&this.callbacks.equals(rhs.callbacks))))&&((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links))))&&((this.securitySchemes == rhs.securitySchemes)||((this.securitySchemes!= null)&&this.securitySchemes.equals(rhs.securitySchemes))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))));
    }

}
