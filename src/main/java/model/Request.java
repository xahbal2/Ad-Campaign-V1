package model;

import java.util.Set;

public class Request {
    private int requestId;
    private String targetedCountries;
    private String targetedDomains ;
    private Dimension dimensions;

    public Request(int requestId, String targetedCountries, String targetedDomains, Dimension dimensions) {
        this.requestId = requestId;
        this.targetedCountries = targetedCountries;
        this.targetedDomains = targetedDomains;
        this.dimensions = dimensions;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getTargetedCountries() {
        return targetedCountries;
    }

    public String getTargetedDomains() {
        return targetedDomains;
    }

    public Dimension getDimensions() {
        return dimensions;
    }
}
