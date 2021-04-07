package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WikipediaPage {
    By searchInput = By.xpath("//input[@id='searchInput']");

    public void searchClick(String value) {
        $(searchInput).click();
        $(searchInput).setValue((value)).pressEnter();
    }
}
