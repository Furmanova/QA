package herokuapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.SecureArea;


public class LoginTest {
    LoginPage loginPage;
    SecureArea secureArea;
    private ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/win/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        secureArea = new SecureArea(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void positiveTest() {
        driver.manage().window().setSize(new Dimension(714, 632));
        loginPage.goToLoginPage();
        loginPage.insertCredentials("tomsmith", "SuperSecretPassword!");
        loginPage.validClickLogin();
        String titleText = driver.findElement(By.id("flash-messages")).getText();
        {
            Assert.assertEquals(titleText, "You logged into a secure area!\n" + "×");
        }
    }

    @Test
    public void negativeTest() {
        driver.manage().window().setSize(new Dimension(714, 632));
        loginPage.goToLoginPage();
        loginPage.insertCredentials("Mark", "1234");
        loginPage.validClickLogin();
        String titleText = driver.findElement(By.id("flash-messages")).getText();
        {
            Assert.assertEquals(titleText, "Your username is invalid!\n" + "×");

        }
    }
}


