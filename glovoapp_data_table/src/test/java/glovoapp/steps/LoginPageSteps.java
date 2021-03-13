package glovoapp.steps;

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

    @When("I fill input data in the login form:")
    public void inputLoginForm(DataTable login) {
        loginPage = page(LoginPage.class);
        List<Map<String, String>> signForms = login.asMaps();
        for (Map<String, String> form : signForms) {
            String userName = form.get("Name");
            String email = form.get("Email");
            String password = form.get("Password");
            loginPage.register(userName, email, password);
        }
    }

    @When("I click Button signup")
    public void clickButtonSignup() {
        loginPage.clickButtonSignup();
    }

    @When("I click agreement Checkbox")
    public void clickChekbox() {
        loginPage.clickCheckbox();
    }

    @When("I click continue and register Button")
    public void clickButtonContinueAndRegister() {
        loginPage.clickButtonContinueAndRegister();

    }

    @Then("I should see message:")
    public void message(DocString message) {
        String expectedMessage = message.getContent();
        loginPage.message(expectedMessage);




    }


}






