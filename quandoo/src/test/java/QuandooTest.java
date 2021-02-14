import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class QuandooTest {
    SearchPage searchPage;

    @BeforeEach
    public void acceptCookies() {
        searchPage = open(BASE_URL, SearchPage.class);
        searchPage.acceptCookies();

    }

    @Test
    public void topRatedBtntTest() {
        searchPage.clickTopRatedBtn();
        searchPage.topRatedBtnIsAttribute().shouldHave(Condition.attribute("data-state", "active"));
        searchPage.topRatedFilter().should(Condition.exist);

    }

}
