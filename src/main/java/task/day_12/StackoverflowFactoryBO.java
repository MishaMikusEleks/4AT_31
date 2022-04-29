package task.day_12;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import task.day_12.po.HomeFactoryPO;
import task.day_12.po.SignupFactoryPO;

public class StackoverflowFactoryBO {
    private WebDriver chromeDriver;

   private HomeFactoryPO homePO;


    SignupFactoryPO signupPO;

    public StackoverflowFactoryBO(WebDriver chromeDriver) {
        this.chromeDriver=chromeDriver;
    }

    @Step
    public void goToHome() {
        homePO=new HomeFactoryPO(chromeDriver);
        homePO.goToHome();
    }

    @Step
    public void signup() {
        signupPO = homePO.clickSignup();
    }

    @Step
    public void verifySignupPageIsOpen() {
        Assert.assertTrue(signupPO.isOpen());
    }

    @Step
    public void putLogin(String userLogin) {
        signupPO
                .insertLogin(userLogin)
                .clickSignUp();
    }
}
