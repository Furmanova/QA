package phoneBook.steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import phoneBook.utils.APITestsHelper;

import static org.junit.Assert.assertEquals;
import static phoneBook.utils.Constants.phoneAPIURL;


public class PhoneAPISteps extends APITestsHelper {
    private RequestSpecification request;
    private static Response response;


    @When("I make POST request for the endpoint 'phone'")
    public void postRequestPhone() {
        request = RestAssured.given().header("Access-Token", token);
        request.header("Content-Type", "application/json");
        response = request.body(createRandomPhone()).post(phoneAPIURL);
    }

    @Then("I see status code {}")
    public void statusCode(Integer code) {
        Integer statusCode = response.getStatusCode();
        assertEquals(code, statusCode);
    }

    @When("I make GET request for the endpoint 'phone'")
    public void getRequestContact() {
        request = RestAssured.given().header("Access-Token", token);
        response = request.get(phoneAPIURL);
    }
}

