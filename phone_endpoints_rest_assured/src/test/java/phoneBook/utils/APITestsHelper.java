package phoneBook.utils;


import com.github.javafaker.Faker;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.json.JsonException;


public class APITestsHelper {
    protected static String token;
    protected static String existingContact;
    protected static String existingPhone;
    private Faker faker = new Faker();


    protected APITestsHelper() {
    }

    //create user using hard-coded credentials
    protected String createUser() throws JsonException {
        return new JSONObject()
                .put("email", "test111@gmail.com")
                .put("password", "12345678").toString();
    }

    //create random contact using Faker
    protected String createRandomContact() throws JSONException {
        return new JSONObject()
                .put("id", faker.random().nextInt(100))
                .put("firstName", faker.name().firstName())
                .put("lastName", faker.name().lastName())
                .put("decription", faker.shakespeare().asYouLikeItQuote()).toString();
    }

    protected String createRandomPhone() throws JSONException {
        return new JSONObject()
                .put("countryCode", faker.random().nextInt(100))
                .put("contactId", "249")
                .put("phoneNumber", faker.phoneNumber().phoneNumber()).toString();
    }
}
