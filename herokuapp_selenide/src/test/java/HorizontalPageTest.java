import org.junit.jupiter.api.Test;
import pages.HorizontalPage;


import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class HorizontalPageTest {

    @Test
    public void sliderTest(){
        HorizontalPage horizontalPage = open(BASE_URL+"/horizontal_slider",
                HorizontalPage.class);
        horizontalPage.moveSlider ("2" );
    }

}
