import org.junit.jupiter.api.Test;
import pages.SliderPage;

import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class SliderTest {
    @Test
    public void testSlider() {
        SliderPage sliderPage = open( BASE_URL + "/horizontal_slider", SliderPage.class);
        sliderPage.moveSlider("2");
    }
}
