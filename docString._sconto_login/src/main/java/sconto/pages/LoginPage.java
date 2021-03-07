package sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import sconto.util.PropertiesLoader;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    /* Properties */

    public static String basicURL = PropertiesLoader.loadProperty("url");


    private static final String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static final String validPwd = PropertiesLoader.loadProperty("valid.password");
    private static final String invalidPwd = PropertiesLoader.loadProperty("invalid.password");
    /* Elements */

    private static final By emailInput = By.id("loginEmail");
    private static final By pwdInput = By.id("loginPassword");
    private static final By loginBtn = By.id("login-submit");
    private static final By loginHeader = By.cssSelector(".existingAccount__headline");
    private static final By errorMessage = By.xpath("//label[contains(.,'Benutzername nicht gefunden oder Passwort falsch.')]");
    private static final By acceptBtn = By.xpath("//*[@data-accept-action='all']");
    private static final By banner = By.cssSelector(".consentForm__title");

    public void errorMessage(String expectedMessage) {
        $(errorMessage).shouldHave(text(expectedMessage));
    }

    public void invalidLoginInput() {
        $(emailInput).setValue(validEmail);
        $(pwdInput).setValue(invalidPwd);
    }

    public void validLoginInput() {
        $(emailInput).setValue(validEmail);
        $(pwdInput).setValue(validPwd);
    }

    public void clickLoginBtn() {
        $(loginBtn).click();
    }

    public SelenideElement loginPageHeader() {
        return $(loginHeader);
    }

    public void acceptCookies() {
        $(acceptBtn).click();
        $(banner).shouldNot(Condition.exist);
    }
}

