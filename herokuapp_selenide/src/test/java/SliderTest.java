//import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import pages.SliderPage;

import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class SliderTest extends BaseTest{
    @Test
    public void testSlider() {
        System.out.println("BROWSER:"+Configuration.browser);
        SliderPage sliderPage = open( BASE_URL + "/horizontal_slider", SliderPage.class);
        sliderPage.moveSlider("2");
    }
}
