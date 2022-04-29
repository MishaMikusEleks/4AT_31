package task.day_12.decorator;

import org.openqa.selenium.WebElement;

public class MyInputWE extends Element{

    public MyInputWE(WebElement webElement) {
        super(webElement);
        this.webElement=webElement;
    }

    public void input(String inputText){
        System.out.println("input '"+inputText+"'");
        waitForMy();
        webElement.sendKeys(inputText);;
    }
}
