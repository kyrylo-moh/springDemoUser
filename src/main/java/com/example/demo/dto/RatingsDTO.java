package com.example.demo.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RatingsDTO implements Serializable {

    @JsonProperty(value = "Source")
    private String source;
    @JsonProperty(value = "Value")
    private String value;

    public RatingsDTO() {
    }

    public RatingsDTO(String source, String value) {
        this.source = source;
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
