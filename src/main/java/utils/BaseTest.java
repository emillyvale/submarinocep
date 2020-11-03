package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class BaseTest {

    public final RequestSpecification spec;

    public BaseTest() {
        baseURI = "https://freight-v3-submarino.b2w.io/";
        basePath = "";
        spec = new RequestSpecBuilder()
                .setRelaxedHTTPSValidation()
                .setContentType(ContentType.JSON)
                .build();

        enableLoggingOfRequestAndResponseIfValidationFails();
    }
}