package pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CountrySelectionPage {
    private static final By COUNTRY_FIND = By.xpath("//p[contains(.,'Страна')]");
    private static final By COUNTRY_OPEN = By.xpath("//span[contains(.,'Украина')]");
    private static final By FIRST_NAME = By.xpath("css=.item-form:nth-child(5) > input");
    private static final By LAST_NAME = By.xpath("//input[@name='name'])[2]");
    private static final By EMAIL = By.id("email");
    private static final By SUBMIT = By.id("form_submit");
    public void countrySelection(String country) {
        $(COUNTRY_FIND).click();
        $(COUNTRY_OPEN).find(country);

    }
    public String firstName(String firstName) {
        $(FIRST_NAME).name();
        return firstName;
    }
    public String lastName(String lastName) {
        $(LAST_NAME).name();
        return faker.name().lastName();
    }
    public String inputEmail(String email) {
        $(EMAIL).setValue(email);
       
        return email;
    }


}
