package phoneBook.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import io.cucumber.java.en.Given;

import phoneBook.utils.APITestsHelper;

import static phoneBook.utils.Constants.*;

public class CommonAPISteps extends APITestsHelper {
    private static Response response;
    private RequestSpecification request;

    //common step to build the client and receive token
    // instance variable token exists in APITestsHelper class
    @Given("I have access token")
    public void accessToken() {
        request = RestAssured.given().header("Content-Type", "application/json");
        response = request.body(createUser()).post(loginAPIUrl);
        token = response.getHeader("Access-Token");
    }

    // common step to create a contact before working with it.
    // contact data assigned to the existingContact instance variable
    @Given("I have existing contact")
    public void existingContact() {
        existingContact = createRandomContact();
        request.header("Access-Token", token);
        response = request.body(existingContact).post(contactAPIURL);
    }

    @Given("I have existing phone")
    public void existingPhone() {
        existingPhone = createRandomPhone();
        request.header("Access-Token", token);
        response = request.body(existingPhone).post(phoneAPIURL);

    }
}

