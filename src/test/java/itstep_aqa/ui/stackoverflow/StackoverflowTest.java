package itstep_aqa.ui.stackoverflow;

import org.openqa.selenium.WebDriver;
import task.day_12.BaseUITest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import task.day_12.BrowserFactory;

public class StackoverflowTest extends BaseUITest {
    protected WebDriver chromeDriver = BrowserFactory.getChromedriver();
    @Test
    void stackoverflowTest(){

        //Step 1 go to sile
        chromeDriver.get("https://stackoverflow.com");

        //Step 2 Click signUp
        chromeDriver.findElement(By.xpath("//a[contains(text(),\"Sign up\") and @rel]")).click();

        //Step 3 verify I am on SignUp page
        Assert.assertTrue(
        chromeDriver
                .findElement(By.xpath("//*[contains(text(),\"Join the Stack Overflow community\")]"))
                .isDisplayed());

    }

    @AfterTest
    void CloseDriver(){
        //chromeDriver.close();
        chromeDriver.quit();
    }
}
