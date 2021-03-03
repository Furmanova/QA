package sconto.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java8.En;
import sconto.pages.HomePage;
import sconto.pages.LoginPage;
import sconto.pages.ProductsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class ProductsSteps implements En {

    HomePage homePage;
    ProductsPage productsPage;
    LoginPage loginPage;


    public ProductsSteps() {
        When("I click on the Sofas", () -> {
            homePage = page(HomePage.class);
            productsPage = homePage.clickProducts();
        });
        Then("I should see catalog page with Sofas", () -> {
           productsPage.headSofas().should(Condition.exist);
            productsPage.headSofas().shouldHave(text("Sofas"));
        });
        When("I click on sofa's favourite icon", () -> {
            productsPage.wishlistIconClick();
        });
        Then("I should see dialog box with anmelden button", () -> {
            productsPage.anmeldenButton().should(Condition.exist);
            productsPage.anmeldenButton().should(text("Anmelden"));
        });

        When("I click anmelden button", () -> {
            productsPage.anmeldenClick();
        });
        Then("I should see login page",() ->{
            loginPage = page(LoginPage.class);
            loginPage.loginPageHeader();

        });
        When("I'm logging in", () -> {
            loginPage = page(LoginPage.class);
            loginPage.validLoginInput();
            loginPage.clickLoginBtn();
        });
        When("I click merkliste icon", () -> {
            productsPage.merklisteIconClick();
        });
        Then("I should see Palina sofa", () -> {
            productsPage.setTextСheck();
        });


    }
}
