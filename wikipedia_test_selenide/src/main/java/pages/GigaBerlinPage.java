package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class GigaBerlinPage {
    By logistics = By.cssSelector(".tocsection-4 .toctext");
    By siteConcerns = By.cssSelector(".tocsection-5 .toctext");
    By checkGoogleMaps = By.cssSelector(".mw-kartographer-map > img");

    public SelenideElement logistics() {
        return $(logistics);
    }

    public SelenideElement siteConcerns() {
        return $(siteConcerns);
    }

    public void checkGoogleMaps() {
        $(checkGoogleMaps).click();
        $(checkGoogleMaps).shouldBe(Condition.exist);
    }

}
