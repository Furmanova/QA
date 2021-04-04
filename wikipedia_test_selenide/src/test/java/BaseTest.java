import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class BaseTest {

    @BeforeClass
    @Parameters({"browser"})
    public void setUpClass(String browser) {

        RemoteWebDriver driver;
        if (browser.equals("chrome")) {
            driver = getChromeDriver();
        } else {
            driver = getFirefoxDriver();
        }
        setWebDriver(driver);
    }

    private RemoteWebDriver getFirefoxDriver() {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "en-GB");
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        return new FirefoxDriver(options);
    }

    private RemoteWebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        return new ChromeDriver(options);
    }

    @BeforeTest
    @Parameters({"browser"})
    public void openBrowser(String browser) {
        Configuration.browser = browser;
    }


}
