package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends Page {
    private static final String LOGIN_URL = "http://the-internet.herokuapp.com/login";
    private static final By USER_Name = By.name("username");
    private static final By Password = By.name("password");
    private static final By LOGIN_BUTTON = By.tagName("button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void insertCredentials(String userName, String password) {
        driver.findElement(USER_Name).click();
        driver.findElement(USER_Name).sendKeys(userName);
        driver.findElement(Password).click();
        driver.findElement(Password).sendKeys(password);
    }

    public void goToLoginPage() {
        driver.navigate().to(LOGIN_URL);
    }

    public SecureArea validClickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
        return new SecureArea(driver);

    }
}
