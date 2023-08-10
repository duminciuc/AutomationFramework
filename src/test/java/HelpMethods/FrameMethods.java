package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethods {

    WebDriver driver;

    public FrameMethods(WebDriver driver){
        this.driver = driver;
    }

    public void  SwitchToFrame(String locator){
        driver.switchTo().frame(locator);
    }

    public void  SwitchToFrame(WebElement element){
        driver.switchTo().frame(element);
    }

    public void SwitchToBase(){
        driver.switchTo().defaultContent();

    }


}
