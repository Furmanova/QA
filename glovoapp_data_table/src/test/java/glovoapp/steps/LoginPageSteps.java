package glovoapp.steps;

import com.github.javafaker.Faker;
import glovoapp.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.page;


public class LoginPageSteps {
    LoginPage loginPage;
    Faker faker = new Faker();

    @When("I fill input data in the login form:")
    public void inputLoginForm(DataTable login) {
        loginPage = page(LoginPage.class);
        List<Map<String, String>> signForms = login.asMaps();
        for (Map<String, String> form : signForms) {
            String userName = form.get("Name");
            String email = faker.internet().emailAddress();
            // String email = form.get("Email");
            String password = form.get("Password");
            loginPage.register(userName, email, password);
        }
    }

    @When("I click Button signup")
    public void clickButtonSignup() {
        loginPage.clickButtonSignup();
    }
    @Then("I see Privacy page")
    public void continueAndRegisterButton(){
        loginPage.setPrivacyPage().exists();

    }

    @When("I click agreement Checkbox")
    public void clickChekbox() {
        loginPage.clickCheckbox();
    }


    @When("I click continue and register Button")
    public void clickButtonContinueAndRegister() {
        loginPage.buttonContinueAndRegister();

    }

    @Then("I should see message:")
    public void message(DocString message) {
        String expectedMessage = message.getContent();
        loginPage.message(expectedMessage);
    }
    @When("I click No, thanks Button")
    public void clickButtonNoThanks(){
        loginPage.setClickNoThanksButton();

    }


}






