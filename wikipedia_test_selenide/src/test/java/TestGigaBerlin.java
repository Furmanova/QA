import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.GigaBerlinPage;
import pages.HomePage;
import pages.WikipediaPage;

import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.GOOGLE_URL;

public class TestGigaBerlin extends BaseTest {

    @Test
    public void searchTest() {
        homePage = open(GOOGLE_URL, HomePage.class);

        homePage.setCookieGoogle();
        homePage.searchGoogle().click();
        homePage.searchGoogle().setValue("wikipedia.org").pressEnter();
        wikipediaPage = homePage.clickWikipedia();

        gigaBerlinPage = wikipediaPage.searchClick("Giga Berlin");

        gigaBerlinPage.logistics().shouldBe(Condition.text("Logistics"));
        gigaBerlinPage.siteConcerns().shouldBe(Condition.text("Site Concerns"));
        gigaBerlinPage.checkGoogleMaps();
    }
}