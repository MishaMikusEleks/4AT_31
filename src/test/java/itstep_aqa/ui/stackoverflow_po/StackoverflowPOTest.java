package itstep_aqa.ui.stackoverflow_po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import task.day_11.StackoverflowBO;
import task.day_12.BaseUITest;

public class StackoverflowPOTest extends BaseUITest {

    private ThreadLocal<WebDriver> chromeDriver = new InheritableThreadLocal<>();

    @DataProvider(parallel = true)
    public static Object[][] testDataProvider() {
        return new Object[][]{
                {"user_1"},
                {"user_2"},
                {"user_3"},
                {"user_4"}
        };
    }

    @Test(dataProvider = "testDataProvider")
    void stackoverflowTest(String userLogin){

        chromeDriver.set(new ChromeDriver());

        StackoverflowBO stackoverflowBO= new StackoverflowBO(chromeDriver.get());

        //Step 1 go to sile
        stackoverflowBO.goToHome();

        //Step 2 Click signUp
        stackoverflowBO.signup();

        //Step 3 verify I am on SignUp page
        stackoverflowBO.verifySignupPageIsOpen();

        //Step 4 put Login
        stackoverflowBO.putLogin(userLogin);
        
    }

    @AfterTest
    void CloseDriver(){
        //chromeDriver.close();
        chromeDriver.get().quit();
    }
}
