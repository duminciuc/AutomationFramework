package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowsPage extends BasePage{

    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> TabsList;

    @FindBy(css = "#Tabbed button")
    private WebElement NewTabWindows;

    @FindBy(css = "#Seperate button")
    private WebElement NewSeperateWindows;

    @FindBy(css = "#Multiple button")
    private WebElement NewSeperateMultipleWindows;

    public void dealTab(){
        elementMethods.clickElement(TabsList.get(0));
        elementMethods.clickElement(NewTabWindows);
        tabMethods.SwitchSpecificTabWindow(1);
        tabMethods.CloseSpecificTabWindow();
        tabMethods.SwitchSpecificTabWindow(0);
    }

    public void dealWindow(){
        TabsList.get(1).click();
        elementMethods.clickElement(TabsList.get(1));
        elementMethods.clickElement(NewSeperateWindows);
        tabMethods.SwitchSpecificTabWindow(1);
        tabMethods.CloseSpecificTabWindow();
        tabMethods.SwitchSpecificTabWindow(0);
    }
    public void dealTabs(){
        TabsList.get(2).click();
        NewSeperateMultipleWindows.click();
        tabMethods.SwitchSpecificTabWindow(2);
        tabMethods.CloseSpecificTabWindow();
        tabMethods.SwitchSpecificTabWindow(1);
        tabMethods.CloseSpecificTabWindow();
        tabMethods.SwitchSpecificTabWindow(0);
    }
}
