import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.CountrySelectionPage;

import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class RegistrationTest {
    @Test
            public void testRegistrationForm(){
        Faker faker = new Faker();
        String value = "Ukraine";
        CountrySelectionPage registrationPage = open(BASE_URL, CountrySelectionPage.class);
        registrationPage.countrySelection(value);
        registrationPage.inputEmail("email");


        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton



    }

}
