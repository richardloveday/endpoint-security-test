package uk.co.semanticintegration;
import org.junit.Test;

import static io.restassured.RestAssured.when;

public class EndPointTest {

    private  String id = "http://data.sparqlr.com/ee/resources/txyu103tvnc";
    private  String path = "http://localhost:8080";
    private String endpoint = "/bookingServiceGetEnquiry";

    @Test
    public void testendpoints(){
        when().get(path+endpoint).
                then().
                statusCode(401);
    }

}
