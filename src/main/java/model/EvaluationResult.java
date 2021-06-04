package model;

import java.util.List;

public class EvaluationResult{
    private int campaignId;
    private List<Integer> qualifiedRequests;

    public EvaluationResult(int campaignId, List<Integer> qualifiedCampaign) {
        this.campaignId = campaignId;
        this.qualifiedRequests = qualifiedCampaign;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public List<Integer> getQualifiedRequests() {
        return qualifiedRequests;
    }
}