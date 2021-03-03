package sconto.pages;

import com.codeborne.selenide.SelenideElement;
import sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    /* Properties */
    private static final String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static final String validPwd = PropertiesLoader.loadProperty("valid.password");

    /* Elements */

    private static final By emailInput = By.id("loginEmail");
    private static final By pwdInput = By.id("loginPassword");
    private static final By loginBtn = By.id("login-submit");
    private static final By loginHeader = By.cssSelector(".existingAccount__headline");


    public void validLoginInput() {
        $(emailInput).setValue(validEmail);
        $(pwdInput).setValue(validPwd);
    }

    public void clickLoginBtn(){
        $(loginBtn).click();
    }

    public SelenideElement loginPageHeader() {return $(loginHeader); }
}

