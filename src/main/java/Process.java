import model.Campaign;
import model.Dimension;
import model.EvaluationResult;
import model.ProcessResult;
import model.Request;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Process {
    public static void main (String[] args){
        List<Campaign> campaigns = Util.buildSomeCampaigns();
        List<Request> requests = Util.buildSomeRequests();
        ProcessResult result = process(campaigns, requests);
        System.out.println(result.toJsonString());

    }

    private static ProcessResult process(List<Campaign> campaigns, List<Request> requests ){
        long start = System.currentTimeMillis();
        List<EvaluationResult> evaluationResults = new ArrayList<>();
        for(Campaign c : campaigns){
            evaluationResults.add(evaluate(requests, c));
        }


        return new ProcessResult(campaigns,evaluationResults,requests.size(),System.currentTimeMillis()-start);
    }

    private static EvaluationResult evaluate(List<Request> requests, Campaign c){
        List<Integer> qualifiedRequests = new ArrayList<>();
        for (Request r : requests){
            if(dimensionMatches(c.getDimensions(),r.getDimensions())&&c.getTargetedCountries().contains(r.getTargetedCountries())&&c.getTargetedDomains().contains(r.getTargetedDomains())){
                qualifiedRequests.add(r.getRequestId());
            }
        }

        return new EvaluationResult(c.getCampaignId(),qualifiedRequests);
    }

    private static boolean dimensionMatches(Set<Dimension> dimensionsSet, Dimension dimension){
        for (Dimension d : dimensionsSet ){
            if (d.equals(dimension)){
                return true;
            }
        }
        return false;
    }
}
