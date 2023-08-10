package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage{

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=\"text\"]")
    private WebElement SingleFrameInput;

    @FindBy(css = "a[href=\"#Multiple\"]")
    private WebElement IframeDublu;

    public void dealSingleFrame(FrameObject frameObject){
        frameMethods.SwitchToFrame("singleframe");
        elementMethods.fillElement(SingleFrameInput,frameObject.getSingleFrame());
        frameMethods.SwitchToBase();
    }

    public void dealMultipleFrames(FrameObject frameObject){

        elementMethods.clickElement(IframeDublu);

        frameMethods.SwitchToFrame(driver.findElement(By.cssSelector("iframe[src=\"MultipleFrames.html\"]")));
        frameMethods.SwitchToFrame(driver.findElement(By.cssSelector("iframe[src=\"SingleFrame.html\"]")));

        elementMethods.fillElement(SingleFrameInput,frameObject.getMultipleFrame());
    }
}
