package model;

import java.util.Set;

public class Campaign {
    private final Integer campaignId;
    private final Set<String> targetedCountries;
    private final Set<String> targetedDomains ;
    private final Set<Dimension> dimensions;

    private Campaign(CampaignBuilder builder){
        this.campaignId = builder.campaignId;
        this.dimensions = builder.dimensions;
        this.targetedCountries = builder.targetedCountries;
        this.targetedDomains = builder.targetedDomains;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public Set<String> getTargetedCountries() {
        return targetedCountries;
    }

    public Set<String> getTargetedDomains() {
        return targetedDomains;
    }

    public Set<Dimension> getDimensions() {
        return dimensions;
    }

    public static class CampaignBuilder {
        private  Integer campaignId;
        private  Set<String> targetedCountries;
        private  Set<String> targetedDomains ;
        private  Set<Dimension> dimensions;

        public CampaignBuilder campaignId(int id){
            this.campaignId = id;
            return this;
        }
        public CampaignBuilder targetedCountries(Set<String> countries){
            this.targetedCountries = countries;
            return this;
        }
        public CampaignBuilder targetedDomains(Set<String> targetedDomains){
            this.targetedDomains = targetedDomains;
            return this;
        }
        public CampaignBuilder dimensions(Set<Dimension> dimensions){
            this.dimensions = dimensions;
            return this;
        }
        public Campaign build(){
            Campaign campaign = new Campaign(this);
            return campaign;
        }
    }

}
