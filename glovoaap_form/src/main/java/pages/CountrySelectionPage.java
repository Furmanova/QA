package pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class CountrySelectionPage {
    @FindBy(id = "onetrust-accept-btn-handler")
    SelenideElement okBtnCookies;
    @FindBy(xpath = "//p[contains(.,'Страна')]")
    SelenideElement dropdownToggleOpen;
    @FindBy(id = "countrySpan")
    ElementsCollection countryList;
    @FindBy(xpath = "(//input[@name='name'])[3]")
    SelenideElement emailSelect;
    @FindBy(xpath = "//div[2]/input")
    SelenideElement firstName;
    @FindBy(xpath = "//div[3]/input")
    SelenideElement lastName;
    @FindBy(css = ".multiselect__select")
    SelenideElement dropdownCodeCountryTel;
    @FindBy(css = ".multiselect__option")
    ElementsCollection listCodeCountry;
    @FindBy(id = "phone")
    SelenideElement telInput;
    @FindBy(xpath = "//div[6]/div/p")
    SelenideElement dropdownType;
    @FindBy(xpath = "//input[@name='numberBranches']")
    SelenideElement inputNumberBranches;
    @FindBy(css = ".label-icon")
    SelenideElement checkBox;
    @FindBy(css = ".active > li")
    ElementsCollection listOfTypes;
    @FindBy(css = ".btn-primary")
    SelenideElement nextButton;

    public void acceptCookies() {
        okBtnCookies.click();
    }

    public void selectDropdownCodeCountryTel(String codeCountry
    ) {
        dropdownCodeCountryTel.click();
        listCodeCountry.findBy(text(codeCountry)).click();
    }

    public void countrySelection(String country) {
        dropdownToggleOpen.click();
        countryList.findBy(text(country)).click();
    }

    public void firstName(String name) {
        firstName.setValue(name);
    }

    public void lastName(String name) {
        lastName.setValue(name);
    }

    public void inputEmail(String email) {
        emailSelect.setValue(email);
    }

    public void fillTelInput(String tel) {
        telInput.setValue(tel);
    }

    public void selectDropdownType(String type) {
        dropdownType.click();
        listOfTypes.findBy(text(type)).click();
    }

    public void fillNumberBtanches(String number) {
        inputNumberBranches.setValue(number);
    }

    public void fillCheckBox() {
        checkBox.click();
    }

    public NextRegistrationPage clickNextButton() {
        nextButton.click();
        return page(NextRegistrationPage.class);
    }


}
