package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class CuisinePage {
    @FindBy(xpath = "//span[contains(.,'Cuisine')]")
    SelenideElement filterBoxCuisine;
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    SelenideElement okBtnCookies;
    @FindBy(xpath = "//div[@id='desktop-filters-wrapper']/div[2]/div[2]/div/li/label/div/span")
    SelenideElement clickCheckboxAfrican;
    @FindBy(xpath = "//span[contains(.,'Cuisine: African')]")
    SelenideElement topRatedFilter;
    @FindBy(xpath = "//div[@data-qa='results-count']")
    SelenideElement resultsCount;


    public void acceptCookies() {
        okBtnCookies.click();
    }

    public void filterBoxCuisine() {
        filterBoxCuisine.click();
    }

    public void clickCheckboxAfrican() {
        clickCheckboxAfrican.click();
    }

    public SelenideElement topRatedFilter() {
        return topRatedFilter;
    }

    public SelenideElement resultsCount() {
        return resultsCount;
    }

}
