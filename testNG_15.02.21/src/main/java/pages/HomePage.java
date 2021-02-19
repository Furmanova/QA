package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    By okBtnCookies = By.cssSelector(".btn-accept-all");
    By iframe = By.cssSelector("body > div > iframe");
    @FindBy(id = "i-search-input")
    SelenideElement inputSearch;

    public ProductCategoryPage searchClick(String value) {
        inputSearch.setValue(value).sendKeys(Keys.ENTER);
        return page(ProductCategoryPage.class);
    }

       public void acceptCookies() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        WebElement frame = switchTo().frame($(iframe)).findElement(By.cssSelector("body"));
        $(frame).$(okBtnCookies).click();
        driver.switchTo().parentFrame();
    }



}



