package sconto.steps;

import com.codeborne.selenide.Condition;
import sconto.pages.CustomerAccountPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.page;

/**
 * CustomerAccountSteps
 * Class implements the Customer Account page step definitions.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class CustomerAccountSteps implements En {

    CustomerAccountPage customerAccountPage;

    public CustomerAccountSteps(){

        Then("I should be logged in", () -> {
            customerAccountPage = page(CustomerAccountPage.class);
            customerAccountPage.accountTitle().should(Condition.exist);
        });
    }
}
