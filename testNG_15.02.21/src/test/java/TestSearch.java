import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductCategoryPage;

import static com.codeborne.selenide.Selenide.open;
import static pages.Configuration.BASE_URL;


public class TestSearch {
    HomePage homePage;
    ProductCategoryPage productCategoryPage;


    @BeforeMethod
    public void setUp() {

       homePage = open(BASE_URL, HomePage.class);
        homePage.acceptCookies();
//        Configuration.timeout = 5000;

    }
    @Test
    public void searchTest()  {
        productCategoryPage=homePage.searchClick("E-bikes");
        productCategoryPage.selectedPrice("Preis: Höchster zuerst");
        productCategoryPage.receiverHighestPrice()
                .shouldHave(Condition.attribute(
                        "selected","selected"));

    }

    @AfterMethod
    public void tearDown() {
        Configuration.holdBrowserOpen = true;
    }
}
