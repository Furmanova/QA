package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class WikipediaPage {
    By searchInput = By.xpath("//input[@id='searchInput']");

    public GigaBerlinPage searchClick(String value) {
        $(searchInput).click();
        $(searchInput).setValue((value)).pressEnter();
        return page(GigaBerlinPage.class);
    }
}
