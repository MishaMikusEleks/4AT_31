package task.day_11;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StackoverflowBO {
    private WebDriver chromeDriver;

   private HomePO homePO;

    public static void main(String[] args) {
    } SignupPO signupPO;

    public StackoverflowBO(WebDriver chromeDriver) {
        this.chromeDriver=chromeDriver;
    }

    public void goToHome() {
        homePO=new HomePO(chromeDriver);
        homePO.goToHome();
    }

    public void signup() {
        signupPO = homePO.clickSignup();
    }

    public void verifySignupPageIsOpen() {
        Assert.assertTrue(signupPO.isOpen());
    }

    public void putLogin(String userLogin) {
        signupPO
                .insertLogin(userLogin)
                .clickSignUp();
        ;

    }
}
