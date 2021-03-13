package glovoapp;

import org.openqa.selenium.By;
import util.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public static String basicURL = PropertiesLoader.loadProperty("url");
    private static final By clickCookies = By.cssSelector("#onetrust-accept-btn-handler");


    public void acceptCookies() {
        if ($(clickCookies).exists()) {
            $(clickCookies).click();
        }

    }

}
