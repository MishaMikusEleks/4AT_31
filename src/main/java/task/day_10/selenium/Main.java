package task.day_10.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        //System.setProperty("webdriver.gecko.driver","driver/geckodriver");

        WebDriver chromeDriver = new ChromeDriver();
       // WebDriver firefoxDriver = new FirefoxDriver();
        chromeDriver.get("https://stackoverflow.com");
        //firefoxDriver.get("https://stackoverflow.com");



        WebElement askQuestionButton=chromeDriver
                .findElement(By.xpath("//a[contains(text(),\"Sign up\") and @rel]"));

        System.out.println(askQuestionButton.getText());
        System.out.println(askQuestionButton.getAccessibleName());
        System.out.println(askQuestionButton.getRect().x+ " "+askQuestionButton.getRect().x);

       askQuestionButton.click();


        chromeDriver.close();
        chromeDriver.quit();
    }
}
