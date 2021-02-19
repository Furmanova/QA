import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CountrySelectionPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class RegistrationTest {
    CountrySelectionPage registrationPage;
    Faker faker = new Faker();

    @BeforeEach
    public void acceptCookies() {
        registrationPage = open(BASE_URL, CountrySelectionPage.class);
        registrationPage.acceptCookies();

    }

    @Test
    public void testRegistrationForm() {
        String email = faker.internet().emailAddress();
        String lastName = faker.name().lastName();
        String firstName = faker.name().firstName();
        String tel = faker.phoneNumber().phoneNumber();
        String numberBranches = faker.numerify("1");

        registrationPage.countrySelection("Украина");

        registrationPage.lastName(lastName);
        registrationPage.firstName(firstName);
        registrationPage.inputEmail(email);

        registrationPage.selectDropdownCodeCountryTel("+93");
        registrationPage.fillTelInput(tel);

        registrationPage.selectDropdownType("Ресторан");

        registrationPage.fillNumberBtanches(numberBranches);
        registrationPage.fillCheckBox();
        registrationPage.clickNextButton().getPageTitle().should(exist);


    }

    @AfterEach
    public void tearDown() {
        Configuration.holdBrowserOpen = true;
    }

}
