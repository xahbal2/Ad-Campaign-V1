package model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;


public class ProcessResult {
    private final List<Campaign> campaigns;
    private final List<EvaluationResult> evaluationResults;
    private final int processedRequests;
    private final long processedTimeMilliseconds;

    public ProcessResult(List<Campaign> campaigns, List<EvaluationResult> evaluationResults, int processedRequests, long processedTimeMilliseconds) {
        this.campaigns = campaigns;
        this.evaluationResults = evaluationResults;
        this.processedRequests = processedRequests;
        this.processedTimeMilliseconds = processedTimeMilliseconds;
    }

    public String toJsonString(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writeValueAsString(this);

            return jsonString;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public List<EvaluationResult> getEvaluationResults() {
        return evaluationResults;
    }

    public int getProcessedRequests() {
        return processedRequests;
    }

    public long getProcessedTimeMilliseconds() {
        return processedTimeMilliseconds;
    }
}


