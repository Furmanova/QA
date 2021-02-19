package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class NextRegistrationPage {
    @FindBy(className = "title")
    SelenideElement pageTitle;

    public SelenideElement getPageTitle() {
        return pageTitle;
    }
}
