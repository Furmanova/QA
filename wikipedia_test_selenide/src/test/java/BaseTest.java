import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.GigaBerlinPage;
import pages.HomePage;
import pages.WikipediaPage;

public class BaseTest {
    HomePage homePage;
    GigaBerlinPage gigaBerlinPage;
    WikipediaPage wikipediaPage;
    //    @BeforeClass
//    @Parameters({"browser"})
//    public void setUpClass(String browser) {
//
//    }
    @BeforeTest
    @Parameters({"browser"})
    public void setupBrowser(String browser) {
        Configuration.browser = browser;

        DesiredCapabilities capabilities;
        if (browser.equals("chrome")) {
            capabilities = getChromeCapabilities();
        } else {
            capabilities = getFirefoxCapabilities();
        }
        Configuration.browserCapabilities = capabilities;

    }

    private DesiredCapabilities getFirefoxCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "en-GB");
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        return capabilities;
    }
/** метод уствнавливает английский язык в хром браузере и возвращает опции браузера */
    private DesiredCapabilities getChromeCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        return capabilities;
    }


}
