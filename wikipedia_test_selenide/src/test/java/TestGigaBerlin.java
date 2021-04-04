import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GigaBerlinPage;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static pages.BasePage.BASE_URL;

public class TestGigaBerlin extends BaseTest{
    HomePage homePage;
    GigaBerlinPage gigaBerlinPage;
    @BeforeMethod
    public void setUp() {
        homePage = open(BASE_URL, HomePage.class);
        gigaBerlinPage = new GigaBerlinPage();
    }


    @Test
    public void searchTest() {
        homePage.searchClick("Giga Berlin");
        gigaBerlinPage.logistics().shouldBe(Condition.text("Logistics"));
        gigaBerlinPage.siteConcerns().shouldBe(Condition.text("Site Concerns"));
        gigaBerlinPage.checkGoogleMaps().click();
    }

    @AfterMethod
    public void tearDown() {
        Configuration.holdBrowserOpen = true;
    }
}
