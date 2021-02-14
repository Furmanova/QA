import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CuisinePage;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static pages.Commons.BASE_URL;

public class CuisineTest {
    CuisinePage cuisinePage;


    @BeforeEach
    public void acceptCookies() {
        cuisinePage = open(BASE_URL, CuisinePage.class);

        cuisinePage.acceptCookies();


    }

    @Test
    public void filterBoxCuisineTest() {
        cuisinePage.filterBoxCuisine();
        cuisinePage.clickCheckboxAfrican();
        cuisinePage.topRatedFilter().should(Condition.exist);
        cuisinePage.resultsCount().should(Condition.exist);
        List<SelenideElement> elementList = $$(byXpath("//*[@data-qa=\"merchant-card-wrapper\"]"));
        Assertions.assertEquals(7, elementList.size());


    }

    @AfterEach
    public void tearDown() {
        Configuration.holdBrowserOpen = true;
    }


}
