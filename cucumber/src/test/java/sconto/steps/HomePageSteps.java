package sconto.steps;

import sconto.pages.HomePage;
import sconto.pages.LoginPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static sconto.pages.HomePage.basicURL;

/**
 * HomePageSteps
 * Class implements the Homepage step definitions.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HomePageSteps implements En {
    HomePage homePage;

    public HomePageSteps() {

        Given("I am on the Homepage", () -> {
            homePage = open(basicURL, HomePage.class);
            homePage.acceptCookies();
        });

        Then("I should see Homepage", () -> {
            homePage.carousel().should(exist);
        });
    }
}
