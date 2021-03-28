package sconto.steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java8.En;
import sconto.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static sconto.pages.LoginPage.basicURL;

/**
 * LoginSteps
 * Class implements the Login page step definitions.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class LoginSteps implements En {

    LoginPage loginPage;

    public LoginSteps() {

        Given("I am on the {}", (String page) -> {
            if (page.equals("LoginPage")) {
                loginPage = open(basicURL, LoginPage.class);
                loginPage.acceptCookies();
            }
        });

        When("I insert {} user credentials", (String state) -> {
            if (state.equals("valid")) {
                loginPage.validLoginInput();
            }
            if (state.equals("invalid")) {
                loginPage.invalidLoginInput();
            }
        });

        Then("I see error message:", (DocString message) -> {
            String expectedMessage = message.getContent();
            loginPage.errorMessage(expectedMessage);
        });

        When("I click on {} button", (String clickButton) -> {
            if (clickButton.equals("Login")) {
                loginPage.clickLoginBtn();
            }
        });
    }
}
