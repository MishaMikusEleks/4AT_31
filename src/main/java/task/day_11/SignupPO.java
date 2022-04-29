package task.day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPO {

    private WebDriver driver;

    public SignupPO(WebDriver driver) {

        this.driver=driver;
    }
    public boolean isOpen() {
        return driver
                .findElement(By.xpath("//*[contains(text(),\"Join the Stack Overflow community\")]"))
                .isDisplayed();
    }

    public SignupPO insertLogin(String userLogin) {
        //TODO
        return this;
    }

    public void clickSignUp() {
        //TODO
    }
}
