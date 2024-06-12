package api.baseurl;

import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

public class BaseUrlRestFul {

    public static RequestSpecification spec;

    static {

        spec = new RequestSpecBuilder()
                .setBaseUri("https://api.restful-api.dev/objects")
                .setContentType(ContentType.JSON)
                .build();

    }
}
