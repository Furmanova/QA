import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import java.net.MalformedURLException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @Parameters({"browser"})
    @BeforeTest
    public void setupTest(String browser){
        //Configuration.driverManagerEnabled = false;
      //  Configuration.remote = "http://localhost:4444/wd/hub";
       // System.setProperty("selenide.remote", "http://192.168.1.190:4444/wd/hub");
        Configuration.browser = browser;
    }
    @AfterTest
    public void closeBrowser(){
        getWebDriver().close();
    }
}
