package de.moemax.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FilterMarkePage {
    private static final By quantityOfGoods = By.cssSelector(".feNmJODYTx2avYkM");

    private static final By clickMarke = By.xpath("//span[contains(text(),'Marke')]");
    private static final By filterSelection = By.xpath("//li/div/div/span");

    public void filterSelection(String selection) {
        $(filterSelection).shouldHave(Condition.text(selection));
    }

    public void clickMarkeBtn(String make) {
        String xpath = "//span[contains(text(),'" + make + "')]";
        $(clickMarke).click();
        $(By.xpath(xpath)).click();
    }

    public boolean checkQuantityOfGoods(String quantity) {
        String xpath = "//div[contains(text(), '" + quantity + "')]";
        return $(By.xpath(xpath)).waitUntil(Condition.appears, 3000).exists();
    }
}
