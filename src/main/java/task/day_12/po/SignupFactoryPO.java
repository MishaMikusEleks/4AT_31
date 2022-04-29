package task.day_12.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import task.day_12.decorator.MyFieldDecorator;
import task.day_12.decorator.MyInputWE;

public class SignupFactoryPO {

    @FindBy(xpath ="//*[contains(text(),\"Join the Stack Overflow community\")]")
    private WebElement textLabel;

    @FindBy(id="display-name")
    private MyInputWE loginInput;

    @FindBy(id="submit-button")
    private WebElement signupButton;

    private WebDriver driver;

    public SignupFactoryPO(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new MyFieldDecorator(driver),this);
    }
    public boolean isOpen() {
        return textLabel.isDisplayed();
    }

    public SignupFactoryPO insertLogin(String userLogin) {
        loginInput.input(userLogin);
        return this;
    }

    public SignupFactoryPO clickSignUp() {
        signupButton.click();
        return this;
    }
}
