package itstep_aqa.ui.day_12_factory;

import com.mysql.cj.exceptions.DataReadException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import task.day_12.BaseUITest;
import task.day_12.BrowserFactory;
import task.day_12.StackoverflowFactoryBO;

import java.time.Duration;
import java.time.temporal.ChronoUnit;


public class StackoverflowPOTest extends BaseUITest {

    @Test
    void stackoverflowTest(){
        WebDriver driver = BrowserFactory.getChromedriver();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        StackoverflowFactoryBO stackoverflowBO= new StackoverflowFactoryBO(
                driver
        );

        //Step 1 go to sile
        stackoverflowBO.goToHome();

        //Step 2 Click signUp
        stackoverflowBO.signup();

        //Step 3 verify I am on SignUp page
        stackoverflowBO.verifySignupPageIsOpen();

        //Step 4 put Login
        stackoverflowBO.putLogin("userLogin");
        
    }

    @AfterTest
    void CloseDriver(){
        //chromeDriver.close();
        BrowserFactory.getChromedriver().quit();
    }
}
