package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    By cookieGoogle = By.xpath("//*[@id=\"zV9nZe\"]/div");
    By searchGoogle = By.xpath("//input");
    By clickWikipedia = By.xpath("//h3[contains(.,'Wikipedia')]");

    public void clickWikipedia() {
        $(clickWikipedia).click();
    }

    public SelenideElement searchGoogle() {
        return $(searchGoogle);
    }

    public void setCookieGoogle() {
        $(cookieGoogle).click();
    }
}
