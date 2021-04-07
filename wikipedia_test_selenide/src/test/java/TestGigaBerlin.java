import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.GigaBerlinPage;
import pages.HomePage;
import pages.WikipediaPage;

import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.GOOGLE_URL;

public class TestGigaBerlin extends BaseTest {
    HomePage homePage;
    GigaBerlinPage gigaBerlinPage;
    WikipediaPage wikipediaPage;

    @Test
    public void searchTest() {
        homePage = open(GOOGLE_URL, HomePage.class);
        wikipediaPage = new WikipediaPage();
        gigaBerlinPage = new GigaBerlinPage();

        homePage.setCookieGoogle();
        homePage.searchGoogle().click();
        homePage.searchGoogle().setValue("wikipedia.org").pressEnter();
        homePage.clickWikipedia();

        wikipediaPage.searchClick("Giga Berlin");

        gigaBerlinPage.logistics().shouldBe(Condition.text("Logistics"));
        gigaBerlinPage.siteConcerns().shouldBe(Condition.text("Site Concerns"));
        gigaBerlinPage.checkGoogleMaps();
    }

    @AfterMethod
    public void tearDown() {
        Configuration.holdBrowserOpen = true;
    }
}
