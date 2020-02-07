package ua.kiev.prog.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SingleRate {
    @JsonProperty("UAH")
    private double uah;

    @JsonProperty("USD")
    private double usd;

    @JsonProperty("GBP")
    private double gbp;

    @JsonProperty("CHF")
    private double chf;
}
