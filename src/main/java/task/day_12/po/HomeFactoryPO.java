package task.day_12.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import task.day_12.decorator.MyButtonWE;
import task.day_12.decorator.MyFieldDecorator;

public class HomeFactoryPO {

    @FindBy(xpath = "//a[contains(text(),\"Sign up\") and @rel]")
    private MyButtonWE signupButton;

   private final WebDriver driver;

    public HomeFactoryPO(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new MyFieldDecorator(driver),this);
    }

    public void goToHome() {
        driver.get("https://stackoverflow.com");
    }

    public SignupFactoryPO clickSignup() {
        signupButton.myClick();
        return new SignupFactoryPO(driver);
    }
}
