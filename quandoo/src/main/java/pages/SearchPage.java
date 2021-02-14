package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(xpath = "//button[@data-qa='filter-button-top-rated']")
     SelenideElement topRatedBtn;
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
     SelenideElement okBtnCookies;
    @FindBy(xpath = "//span[contains(.,'Review score: 4-6')]")
     SelenideElement topRatedFilter;

    public void clickTopRatedBtn() {
        topRatedBtn.click();
    }

    public SelenideElement topRatedBtnIsAttribute() {

        return topRatedBtn;

    }

    public void acceptCookies() {
        okBtnCookies.click();

    }

    public SelenideElement topRatedFilter() {
        return topRatedFilter;
    }

}
