package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertMethods {
    WebDriver driver;

    public AlertMethods(WebDriver driver){
        this.driver = driver;
    }

    public void AcceptAlert(){
        Alert AlertaOK = driver.switchTo().alert();
        AlertaOK.accept();
    }

    public void DismissAlert(){
        Alert AlertDismiss = driver.switchTo().alert();
        AlertDismiss.dismiss();
    }

    public void AcceptFillAlert(String value){
        Alert AlertText = driver.switchTo().alert();
        AlertText.sendKeys(value);
        AlertText.accept();
    }

}
