import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HorizontalPage;


import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class HorizontalPageTest extends BaseTest {

    @Test
    public void sliderTest(){
        HorizontalPage horizontalPage = open(BASE_URL+"/horizontal_slider",
                HorizontalPage.class);
        horizontalPage.moveSlider ("2" );
    }
}
