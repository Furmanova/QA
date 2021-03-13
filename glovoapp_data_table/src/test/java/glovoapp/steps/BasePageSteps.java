package glovoapp.steps;



import glovoapp.BasePage;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static glovoapp.BasePage.basicURL;


public class BasePageSteps {
    BasePage basePage;


        @Given("I am on the Signup page")
                public void goToSignupPage(){
            basePage = open(basicURL + "/signup", BasePage.class);
            basePage.acceptCookies();

        }

    }



