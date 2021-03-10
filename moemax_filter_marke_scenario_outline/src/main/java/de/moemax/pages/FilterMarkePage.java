package de.moemax.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FilterMarkePage {
    private static final By clickMarke = By.xpath("//span[contains(text(),'Marke')]");

    public void clickMarkeBtn(String make) {
        String xpath = "//span[contains(text(),'" + make + "')]";
        $(clickMarke).click();
        $(By.xpath(xpath)).click();
    }

    public void checkQuantityOfGoods(String quantity) {
        String xpath = "//div[contains(text(), '" + quantity + "')]";
        $(By.xpath(xpath)).waitUntil(Condition.appears, 3000).shouldHave(Condition.exist);
    }
}
