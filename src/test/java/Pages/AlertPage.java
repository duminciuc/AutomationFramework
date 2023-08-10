package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> AlertOptions;

    @FindBy(css = ".btn.btn-danger")
    private WebElement AlertOKBtn;

    @FindBy(css = ".btn.btn-primary")
    private  WebElement AlertOKCancelBtn;

    @FindBy(css = ".btn.btn-info")
    private WebElement AlertWithTextboxBtn;

    public void manageAlertOK(){
        elementMethods.clickElement(AlertOptions.get(0));
        elementMethods.clickElement(AlertOKBtn);
        alertMethods.AcceptAlert();
    }
    public void manageAlertOKCancel(){
        elementMethods.clickElement(AlertOptions.get(1));
        elementMethods.clickElement(AlertOKCancelBtn);
        alertMethods.DismissAlert();
    }

    public void manageAlertSendKeys(AlertObject alertObject){
        elementMethods.clickElement(AlertOptions.get(1));
        elementMethods.clickElement(AlertWithTextboxBtn);
        alertMethods.AcceptFillAlert(alertObject.getAlertValue());
    }
}
