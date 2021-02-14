package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Selenide.$;


public class HorizontalPage {
    private static final By INPUT = By.cssSelector("input");

    public void moveSlider(String range){
        if (range.equals("2"))
            $(INPUT).click();
        $(INPUT).sendKeys(Keys.ARROW_LEFT);
    }

}
