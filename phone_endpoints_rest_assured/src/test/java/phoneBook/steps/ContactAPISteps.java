package phoneBook.steps;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import phoneBook.utils.APITestsHelper;

import static phoneBook.utils.Constants.contactAPIURL;

public class ContactAPISteps extends APITestsHelper {
    private RequestSpecification request;
    private static Response response;

    @When("I make POST request for the endpoint 'contact'")
    public void postRequestContact() {
        request = RestAssured.given().header("Access-Token", token);
        request.header("Content-Type", "application/json");
        response = request.body(createRandomContact()).post(contactAPIURL);
    }

//        @Then("I see status code {}")
//        public void statusCode(Integer code){
//            Integer statusCode = response.getStatusCode();
//            assertEquals(code, statusCode);
//        }

    @When("I make GET request for the endpoint 'contact'")
    public void getRequestContact() {
        request = RestAssured.given().header("Access-Token", token);
        response = request.get(contactAPIURL);
    }
}
