
package com.example.schema;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "integerAsDateTime",
    "stringAsDateTime",
    "stringAsTime",
    "stringAsDate",
    "numberAsUtcMillisec",
    "stringAsUtcMillisec",
    "customFormattedNumber",
    "stringAsRegex",
    "stringAsHostname",
    "stringAsIpAddress",
    "stringAsIpv6",
    "stringAsColor",
    "stringAsStyle",
    "stringAsPhone",
    "stringAsUri",
    "stringAsEmail"
})
@Generated("jsonschema2pojo")
public class FormattedProperties {

    @JsonProperty("integerAsDateTime")
    private Date integerAsDateTime;
    @JsonProperty("stringAsDateTime")
    private Date stringAsDateTime;
    @JsonProperty("stringAsTime")
    private String stringAsTime;
    @JsonProperty("stringAsDate")
    private String stringAsDate;
    @JsonProperty("numberAsUtcMillisec")
    private Long numberAsUtcMillisec;
    @JsonProperty("stringAsUtcMillisec")
    private Long stringAsUtcMillisec;
    @JsonProperty("customFormattedNumber")
    private Double customFormattedNumber;
    @JsonProperty("stringAsRegex")
    private Pattern stringAsRegex;
    @JsonProperty("stringAsHostname")
    private String stringAsHostname;
    @JsonProperty("stringAsIpAddress")
    private String stringAsIpAddress;
    @JsonProperty("stringAsIpv6")
    private String stringAsIpv6;
    @JsonProperty("stringAsColor")
    private String stringAsColor;
    @JsonProperty("stringAsStyle")
    private String stringAsStyle;
    @JsonProperty("stringAsPhone")
    private String stringAsPhone;
    @JsonProperty("stringAsUri")
    private URI stringAsUri;
    @JsonProperty("stringAsEmail")
    private String stringAsEmail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("integerAsDateTime")
    public Date getIntegerAsDateTime() {
        return integerAsDateTime;
    }

    @JsonProperty("integerAsDateTime")
    public void setIntegerAsDateTime(Date integerAsDateTime) {
        this.integerAsDateTime = integerAsDateTime;
    }

    @JsonProperty("stringAsDateTime")
    public Date getStringAsDateTime() {
        return stringAsDateTime;
    }

    @JsonProperty("stringAsDateTime")
    public void setStringAsDateTime(Date stringAsDateTime) {
        this.stringAsDateTime = stringAsDateTime;
    }

    @JsonProperty("stringAsTime")
    public String getStringAsTime() {
        return stringAsTime;
    }

    @JsonProperty("stringAsTime")
    public void setStringAsTime(String stringAsTime) {
        this.stringAsTime = stringAsTime;
    }

    @JsonProperty("stringAsDate")
    public String getStringAsDate() {
        return stringAsDate;
    }

    @JsonProperty("stringAsDate")
    public void setStringAsDate(String stringAsDate) {
        this.stringAsDate = stringAsDate;
    }

    @JsonProperty("numberAsUtcMillisec")
    public Long getNumberAsUtcMillisec() {
        return numberAsUtcMillisec;
    }

    @JsonProperty("numberAsUtcMillisec")
    public void setNumberAsUtcMillisec(Long numberAsUtcMillisec) {
        this.numberAsUtcMillisec = numberAsUtcMillisec;
    }

    @JsonProperty("stringAsUtcMillisec")
    public Long getStringAsUtcMillisec() {
        return stringAsUtcMillisec;
    }

    @JsonProperty("stringAsUtcMillisec")
    public void setStringAsUtcMillisec(Long stringAsUtcMillisec) {
        this.stringAsUtcMillisec = stringAsUtcMillisec;
    }

    @JsonProperty("customFormattedNumber")
    public Double getCustomFormattedNumber() {
        return customFormattedNumber;
    }

    @JsonProperty("customFormattedNumber")
    public void setCustomFormattedNumber(Double customFormattedNumber) {
        this.customFormattedNumber = customFormattedNumber;
    }

    @JsonProperty("stringAsRegex")
    public Pattern getStringAsRegex() {
        return stringAsRegex;
    }

    @JsonProperty("stringAsRegex")
    public void setStringAsRegex(Pattern stringAsRegex) {
        this.stringAsRegex = stringAsRegex;
    }

    @JsonProperty("stringAsHostname")
    public String getStringAsHostname() {
        return stringAsHostname;
    }

    @JsonProperty("stringAsHostname")
    public void setStringAsHostname(String stringAsHostname) {
        this.stringAsHostname = stringAsHostname;
    }

    @JsonProperty("stringAsIpAddress")
    public String getStringAsIpAddress() {
        return stringAsIpAddress;
    }

    @JsonProperty("stringAsIpAddress")
    public void setStringAsIpAddress(String stringAsIpAddress) {
        this.stringAsIpAddress = stringAsIpAddress;
    }

    @JsonProperty("stringAsIpv6")
    public String getStringAsIpv6() {
        return stringAsIpv6;
    }

    @JsonProperty("stringAsIpv6")
    public void setStringAsIpv6(String stringAsIpv6) {
        this.stringAsIpv6 = stringAsIpv6;
    }

    @JsonProperty("stringAsColor")
    public String getStringAsColor() {
        return stringAsColor;
    }

    @JsonProperty("stringAsColor")
    public void setStringAsColor(String stringAsColor) {
        this.stringAsColor = stringAsColor;
    }

    @JsonProperty("stringAsStyle")
    public String getStringAsStyle() {
        return stringAsStyle;
    }

    @JsonProperty("stringAsStyle")
    public void setStringAsStyle(String stringAsStyle) {
        this.stringAsStyle = stringAsStyle;
    }

    @JsonProperty("stringAsPhone")
    public String getStringAsPhone() {
        return stringAsPhone;
    }

    @JsonProperty("stringAsPhone")
    public void setStringAsPhone(String stringAsPhone) {
        this.stringAsPhone = stringAsPhone;
    }

    @JsonProperty("stringAsUri")
    public URI getStringAsUri() {
        return stringAsUri;
    }

    @JsonProperty("stringAsUri")
    public void setStringAsUri(URI stringAsUri) {
        this.stringAsUri = stringAsUri;
    }

    @JsonProperty("stringAsEmail")
    public String getStringAsEmail() {
        return stringAsEmail;
    }

    @JsonProperty("stringAsEmail")
    public void setStringAsEmail(String stringAsEmail) {
        this.stringAsEmail = stringAsEmail;
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
        sb.append(FormattedProperties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("integerAsDateTime");
        sb.append('=');
        sb.append(((this.integerAsDateTime == null)?"<null>":this.integerAsDateTime));
        sb.append(',');
        sb.append("stringAsDateTime");
        sb.append('=');
        sb.append(((this.stringAsDateTime == null)?"<null>":this.stringAsDateTime));
        sb.append(',');
        sb.append("stringAsTime");
        sb.append('=');
        sb.append(((this.stringAsTime == null)?"<null>":this.stringAsTime));
        sb.append(',');
        sb.append("stringAsDate");
        sb.append('=');
        sb.append(((this.stringAsDate == null)?"<null>":this.stringAsDate));
        sb.append(',');
        sb.append("numberAsUtcMillisec");
        sb.append('=');
        sb.append(((this.numberAsUtcMillisec == null)?"<null>":this.numberAsUtcMillisec));
        sb.append(',');
        sb.append("stringAsUtcMillisec");
        sb.append('=');
        sb.append(((this.stringAsUtcMillisec == null)?"<null>":this.stringAsUtcMillisec));
        sb.append(',');
        sb.append("customFormattedNumber");
        sb.append('=');
        sb.append(((this.customFormattedNumber == null)?"<null>":this.customFormattedNumber));
        sb.append(',');
        sb.append("stringAsRegex");
        sb.append('=');
        sb.append(((this.stringAsRegex == null)?"<null>":this.stringAsRegex));
        sb.append(',');
        sb.append("stringAsHostname");
        sb.append('=');
        sb.append(((this.stringAsHostname == null)?"<null>":this.stringAsHostname));
        sb.append(',');
        sb.append("stringAsIpAddress");
        sb.append('=');
        sb.append(((this.stringAsIpAddress == null)?"<null>":this.stringAsIpAddress));
        sb.append(',');
        sb.append("stringAsIpv6");
        sb.append('=');
        sb.append(((this.stringAsIpv6 == null)?"<null>":this.stringAsIpv6));
        sb.append(',');
        sb.append("stringAsColor");
        sb.append('=');
        sb.append(((this.stringAsColor == null)?"<null>":this.stringAsColor));
        sb.append(',');
        sb.append("stringAsStyle");
        sb.append('=');
        sb.append(((this.stringAsStyle == null)?"<null>":this.stringAsStyle));
        sb.append(',');
        sb.append("stringAsPhone");
        sb.append('=');
        sb.append(((this.stringAsPhone == null)?"<null>":this.stringAsPhone));
        sb.append(',');
        sb.append("stringAsUri");
        sb.append('=');
        sb.append(((this.stringAsUri == null)?"<null>":this.stringAsUri));
        sb.append(',');
        sb.append("stringAsEmail");
        sb.append('=');
        sb.append(((this.stringAsEmail == null)?"<null>":this.stringAsEmail));
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
        result = ((result* 31)+((this.stringAsStyle == null)? 0 :this.stringAsStyle.hashCode()));
        result = ((result* 31)+((this.stringAsDate == null)? 0 :this.stringAsDate.hashCode()));
        result = ((result* 31)+((this.stringAsColor == null)? 0 :this.stringAsColor.hashCode()));
        result = ((result* 31)+((this.customFormattedNumber == null)? 0 :this.customFormattedNumber.hashCode()));
        result = ((result* 31)+((this.stringAsIpAddress == null)? 0 :this.stringAsIpAddress.hashCode()));
        result = ((result* 31)+((this.stringAsTime == null)? 0 :this.stringAsTime.hashCode()));
        result = ((result* 31)+((this.integerAsDateTime == null)? 0 :this.integerAsDateTime.hashCode()));
        result = ((result* 31)+((this.stringAsRegex == null)? 0 :this.stringAsRegex.hashCode()));
        result = ((result* 31)+((this.stringAsIpv6 == null)? 0 :this.stringAsIpv6 .hashCode()));
        result = ((result* 31)+((this.numberAsUtcMillisec == null)? 0 :this.numberAsUtcMillisec.hashCode()));
        result = ((result* 31)+((this.stringAsPhone == null)? 0 :this.stringAsPhone.hashCode()));
        result = ((result* 31)+((this.stringAsDateTime == null)? 0 :this.stringAsDateTime.hashCode()));
        result = ((result* 31)+((this.stringAsHostname == null)? 0 :this.stringAsHostname.hashCode()));
        result = ((result* 31)+((this.stringAsUri == null)? 0 :this.stringAsUri.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stringAsUtcMillisec == null)? 0 :this.stringAsUtcMillisec.hashCode()));
        result = ((result* 31)+((this.stringAsEmail == null)? 0 :this.stringAsEmail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FormattedProperties) == false) {
            return false;
        }
        FormattedProperties rhs = ((FormattedProperties) other);
        return ((((((((((((((((((this.stringAsStyle == rhs.stringAsStyle)||((this.stringAsStyle!= null)&&this.stringAsStyle.equals(rhs.stringAsStyle)))&&((this.stringAsDate == rhs.stringAsDate)||((this.stringAsDate!= null)&&this.stringAsDate.equals(rhs.stringAsDate))))&&((this.stringAsColor == rhs.stringAsColor)||((this.stringAsColor!= null)&&this.stringAsColor.equals(rhs.stringAsColor))))&&((this.customFormattedNumber == rhs.customFormattedNumber)||((this.customFormattedNumber!= null)&&this.customFormattedNumber.equals(rhs.customFormattedNumber))))&&((this.stringAsIpAddress == rhs.stringAsIpAddress)||((this.stringAsIpAddress!= null)&&this.stringAsIpAddress.equals(rhs.stringAsIpAddress))))&&((this.stringAsTime == rhs.stringAsTime)||((this.stringAsTime!= null)&&this.stringAsTime.equals(rhs.stringAsTime))))&&((this.integerAsDateTime == rhs.integerAsDateTime)||((this.integerAsDateTime!= null)&&this.integerAsDateTime.equals(rhs.integerAsDateTime))))&&((this.stringAsRegex == rhs.stringAsRegex)||((this.stringAsRegex!= null)&&this.stringAsRegex.equals(rhs.stringAsRegex))))&&((this.stringAsIpv6 == rhs.stringAsIpv6)||((this.stringAsIpv6 != null)&&this.stringAsIpv6 .equals(rhs.stringAsIpv6))))&&((this.numberAsUtcMillisec == rhs.numberAsUtcMillisec)||((this.numberAsUtcMillisec!= null)&&this.numberAsUtcMillisec.equals(rhs.numberAsUtcMillisec))))&&((this.stringAsPhone == rhs.stringAsPhone)||((this.stringAsPhone!= null)&&this.stringAsPhone.equals(rhs.stringAsPhone))))&&((this.stringAsDateTime == rhs.stringAsDateTime)||((this.stringAsDateTime!= null)&&this.stringAsDateTime.equals(rhs.stringAsDateTime))))&&((this.stringAsHostname == rhs.stringAsHostname)||((this.stringAsHostname!= null)&&this.stringAsHostname.equals(rhs.stringAsHostname))))&&((this.stringAsUri == rhs.stringAsUri)||((this.stringAsUri!= null)&&this.stringAsUri.equals(rhs.stringAsUri))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stringAsUtcMillisec == rhs.stringAsUtcMillisec)||((this.stringAsUtcMillisec!= null)&&this.stringAsUtcMillisec.equals(rhs.stringAsUtcMillisec))))&&((this.stringAsEmail == rhs.stringAsEmail)||((this.stringAsEmail!= null)&&this.stringAsEmail.equals(rhs.stringAsEmail))));
    }

}
