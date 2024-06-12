package api.stepdefinitions;


import api.pojos.ResponsePojo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;

import static api.baseurl.BaseUrlRestFul.spec;
import static api.utilities.ObjectMapperUtilities.convertJsonToJava;
import static io.restassured.RestAssured.given;

public class StepDefs {
    private ResponsePojo payload;
    private Response response;
    @When("user send post request with needed payload")
    public void userSendPostRequestWithNeededPayload() {
        //Set Payload Using Pojo
        String payloadStr= """
                {
                   "name": "Apple MacBook Pro 16",
                   "data": {
                      "year": 2019,
                      "price": 1849.99,
                      "CPU model": "Intel Core i9",
                      "Hard disk size": "1 TB"
                   }
                }""";
        //Convert String to Pojo Class Using ObjectMapper
        payload =convertJsonToJava(payloadStr, ResponsePojo.class);
        //Send POST Request
        response = given(spec).body(payload).when().post();
        response.prettyPrint();
    }

    @Then("Validate the Response body")
    public void validateTheResponseBody() {
        //Convert String to Pojo Class Using ObjectMapper
        ResponsePojo actualData =convertJsonToJava(response.asString(), ResponsePojo.class);
        //Do Assertion

        SoftAssert softAssert=new SoftAssert();

        //Verify StatusCode is equal to 200
        softAssert.assertEquals(response.statusCode(),200);

        //Verify that id and createdAt is not null
        softAssert.assertNotNull(actualData.getId());
        softAssert.assertNotNull(actualData.getCreatedAt());

        //Verify that name,year,price,CPU model and Hard disk size are equal to payload values
        softAssert.assertEquals(actualData.getName(),payload.getName());
        softAssert.assertEquals(actualData.getData().getYear(),payload.getData().getYear());
        softAssert.assertEquals(actualData.getData().getPrice(),payload.getData().getPrice());
        softAssert.assertEquals(actualData.getData().getCPUModel(),payload.getData().getCPUModel());
        softAssert.assertEquals(actualData.getData().getHardDiskSize(),payload.getData().getHardDiskSize());

        softAssert.assertAll();

    }
}
