package sconto.steps;

import io.cucumber.java8.En;
import sconto.pages.HomePage;
import sconto.pages.LoginPage;
import sconto.pages.ProductsPage;

import static com.codeborne.selenide.Selenide.page;

public class ProductsSteps implements En {

    HomePage homePage;
    ProductsPage productsPage;
    LoginPage loginPage;
    public ProductsSteps(){
        When("I click on the Sofa", () ->{
            homePage = page(HomePage.class);
            productsPage =  homePage.clickProducts();
        });

        Then("I click on the wish list icon", () -> {
            productsPage.wishlistIconClick();
        });

        When("I click anmeldun", () ->{
            productsPage.anmeldenClick();
        });
        Then("I log in", () ->{
            loginPage = page(LoginPage.class);
            loginPage.validLoginInput();
            loginPage.clickLoginBtn();


        });
        When("I click merkliste icon",() ->{
            productsPage.merklisteIconClick();
        });
        Then("I text check", () ->{
            productsPage.setTextСheck();
        });





    }
}
