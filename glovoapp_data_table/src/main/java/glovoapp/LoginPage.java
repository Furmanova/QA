package glovoapp;

import com.codeborne.selenide.*;
import com.codeborne.selenide.impl.WebElementsCollectionWrapper;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final By inputName = By.xpath("//input[@name=\"inner_name\"]");
    private static final By inputEmail = By.xpath("//input[@name=\"inner_email\"]");
    private static final By inputPassword = By.xpath("//input[@name=\"inner_password\"]");
    private static final By clickButtonSignup = By.xpath("//button[@data-test-id='signup-submit']");
    private static final By clickCheckbox = By.cssSelector(".privacy__term:nth-child(2) .el-checkbox__inner");
    private static final By clickButtonContinueAndRegister = By.xpath("//button[@data-test-id=\"submit-terms-conditions\"]");
    //  private static final By errorMessage = By.xpath("//span[contains(text(),'An account with this email address already exists')]");
    private static final By clickNoThanksButton = By.xpath("//*[contains(text(),'No, thanks')]");
    private static final By validMessage = By.xpath("//*[contains(text(),'Enter your mobile phone number to enable')]");
    private static final By privacyPage = By.xpath("//h1[contains(text(),'Privacy')]");
    private static final By personalPageUsername = By.xpath("//span[@class=\"dropdown_button el-dropdown-selfdefine\"]");

    public void register(String name, String email, String password) {
        $(inputName).click();
        $(inputName).sendKeys(name);
        $(inputName).pressEnter();
        $(inputEmail).sendKeys(email);
        $(inputEmail).pressEnter();
        $(inputPassword).sendKeys(password);
    }

    public void clickButtonSignup() {
        $(clickButtonSignup).shouldHave(Condition.exist).click();
    }

    public SelenideElement setPrivacyPage() {
        return $(privacyPage);
    }

    public void clickCheckbox() {
        $(clickCheckbox).click();
    }

    public void buttonContinueAndRegister() {
        $(clickButtonContinueAndRegister).shouldHave(Condition.exist).click();
    }

    public void message(String message) {
        $(validMessage).shouldHave(Condition.text(message));
    }

    public void setClickNoThanksButton() {
        $(clickNoThanksButton).click();
        Configuration.holdBrowserOpen = true;
    }

    public SelenideElement personalPage() {
        return $(personalPageUsername);
    }
}
