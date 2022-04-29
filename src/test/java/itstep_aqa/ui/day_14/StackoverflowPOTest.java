package itstep_aqa.ui.day_14;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import task.day_12.BaseUITest;
import task.day_12.BrowserFactory;
import task.day_12.StackoverflowFactoryBO;
import task.day_13.CustomSuiteListener;
import task.day_13.CustomTestListener;
import task.day_14.AllureTestListener;

@Listeners({
        CustomTestListener.class,
        CustomSuiteListener.class,
        AllureTestListener.class
})
public class StackoverflowPOTest extends BaseUITest {

    @Test
    void stackoverflowFailTest(){

        StackoverflowFactoryBO stackoverflowBO= new StackoverflowFactoryBO(driver);

        //Step 1 go to sile
        stackoverflowBO.goToHome();
        Assert.assertFalse(true);
        
    }


    @Test
    void stackoverflowTest(){

        StackoverflowFactoryBO stackoverflowBO= new StackoverflowFactoryBO(driver);

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
