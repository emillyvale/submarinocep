package testcases;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.BaseTest;



public class HealthCheckTest extends BaseTest {

    @Test(testName = "Validar CEP")
    public void healthCheckTest(){
        Response response = RestAssured.request(Method.GET, "https://freight-v3-submarino.b2w.io/actuator/health");
        System.out.println(response.getBody().asString());
        System.out.println(response.statusCode());
    }

}
