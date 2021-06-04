import model.Campaign;
import model.Dimension;
import model.Request;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Util {
    // This class just creates data to test
    private static final String DOMAIN_APPLE = "apple.com";
    private static final String DOMAIN_GOOGLE = "google.com";
    private static final String DOMAIN_FACEBOOK = "facebook.com";
    private static final String DOMAIN_TWITTER = "twitter.com";
    private static final List<String> LIST_OF_DOMAINS = Arrays.asList(DOMAIN_APPLE,DOMAIN_GOOGLE,DOMAIN_FACEBOOK,DOMAIN_TWITTER);
    private static final Set<String> DOMAINS1 = new HashSet<>(LIST_OF_DOMAINS.subList(0,1));
    private static final Set<String> DOMAINS2 = new HashSet<>(LIST_OF_DOMAINS.subList(0,2));
    private static final Set<String> DOMAINS3 = new HashSet<>(LIST_OF_DOMAINS.subList(1,4));

    private static final String COUNTRY_CA = "CA";
    private static final String COUNTRY_US = "US";
    private static final String COUNTRY_IT = "IT";
    private static final List<String> LIST_OF_COUNTRIES = Arrays.asList(COUNTRY_CA,COUNTRY_IT,COUNTRY_US);
    private static final Set<String> COUNTRIES1 = new HashSet<>(LIST_OF_COUNTRIES.subList(0,1));
    private static final Set<String> COUNTRIES2 = new HashSet<>(LIST_OF_COUNTRIES.subList(0,2));
    private static final Set<String> COUNTRIES3 = new HashSet<>(LIST_OF_COUNTRIES.subList(1,3));

    private static final Integer DIMENSION_LENGTH_1 = 100 ;
    private static final Integer DIMENSION_LENGTH_2 = 200 ;
    private static final Integer DIMENSION_LENGTH_3 = 300 ;
    private static final Integer DIMENSION_HEIGHT_1 = 400 ;
    private static final Integer DIMENSION_HEIGHT_2 = 600 ;
    private static final Integer DIMENSION_HEIGHT_3 = 800 ;
    private static final Dimension D1 = new Dimension(DIMENSION_LENGTH_1, DIMENSION_HEIGHT_1);
    private static final Dimension D2 = new Dimension(DIMENSION_LENGTH_2, DIMENSION_HEIGHT_2);
    private static final Dimension D3 = new Dimension(DIMENSION_LENGTH_3, DIMENSION_HEIGHT_3);
    private static final Dimension D4 = new Dimension(DIMENSION_LENGTH_1, DIMENSION_HEIGHT_3);
    private static final Dimension D5 = new Dimension(DIMENSION_LENGTH_2, DIMENSION_HEIGHT_1);
    private static final Dimension D6 = new Dimension(DIMENSION_LENGTH_3, DIMENSION_HEIGHT_2);
    private static final List<Dimension> LIST_OF_DIMENSIONS = Arrays.asList(D1,D2,D3,D4,D5,D6);
    private static final Set<Dimension> DIMENSION1 = new HashSet<>(LIST_OF_DIMENSIONS.subList(0,3));
    private static final Set<Dimension> DIMENSION2 = new HashSet<>(LIST_OF_DIMENSIONS.subList(2,5));
    private static final Set<Dimension> DIMENSION3 = new HashSet<>(LIST_OF_DIMENSIONS.subList(1,4));


    public static List<Campaign> buildSomeCampaigns(){
        Campaign cc1 = new Campaign.CampaignBuilder()
                .campaignId(0)
                .dimensions(DIMENSION1)
                .targetedCountries(COUNTRIES1)
                .targetedDomains(DOMAINS1)
                .build();

        Campaign cc2 = new Campaign.CampaignBuilder()
                .campaignId(1)
                .dimensions(DIMENSION2)
                .targetedCountries(COUNTRIES2)
                .targetedDomains(DOMAINS2)
                .build();

        Campaign cc3 = new Campaign.CampaignBuilder().
                campaignId(2)
                .dimensions(DIMENSION3)
                .targetedCountries(COUNTRIES3)
                .targetedDomains(DOMAINS3)
                .build();




        return Arrays.asList(cc1,cc2,cc3);
    }

    public static List<Request> buildSomeRequests(){
        Request r1 = new Request(0,COUNTRY_CA,DOMAIN_APPLE,D1);
        Request r2 = new Request(1,COUNTRY_US,DOMAIN_GOOGLE,D2);
        Request r3 = new Request(2,COUNTRY_IT,DOMAIN_FACEBOOK,D3);

        return Arrays.asList(r1,r2,r3);

    }



}
