package sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {
    private static final By wishlistIconClick = By.xpath("//*[@id=\"filterProducts\"]/div/div[1]/div/div[1]/div");
    private static final By merklisteIconClick = By.xpath("//span[contains(text(),'Merkliste')]");
    private static final By anmeldenClick = By.cssSelector(".fancybox-content #addToWishlistLoginBox .button__label");
    private static final By textСheck = By.xpath("//span[contains(text(),'Palina')]");
    private static final By headSofas = By.cssSelector(".categoryHeadline");
    private static final By anmeldenButton = By.cssSelector(".fancybox-content #addToWishlistLoginBox .button__label");

    public SelenideElement anmeldenButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(anmeldenButton);
    }

    public SelenideElement headSofas() {
        return $(headSofas);
    }

    public void setTextСheck() {
        $(textСheck).shouldHave(text("Palina"));
    }

    public void anmeldenClick() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(anmeldenClick).click();

    }

    public void merklisteIconClick() {
        $(merklisteIconClick).click();
    }

    public void wishlistIconClick() {
        $(wishlistIconClick).click();
    }

}
