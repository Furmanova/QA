package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {
    By cookieGoogle = By.xpath("//*[@id=\"zV9nZe\"]/div");
    By searchGoogle = By.xpath("//input");
    By clickWikipedia = By.xpath("//h3[contains(.,'Wikipedia')]");

    public WikipediaPage clickWikipedia() {
         $(clickWikipedia).click();
        return page(WikipediaPage.class);
    }

    public SelenideElement searchGoogle() {
        return $(searchGoogle);
    }

    public void setCookieGoogle() {
        $(cookieGoogle).click();
    }
}
