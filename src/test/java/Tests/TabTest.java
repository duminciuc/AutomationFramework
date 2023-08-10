package Tests;

import Base.BaseTest;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.TabMethods;
import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowsPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.browser.model.WindowState;

import java.util.ArrayList;
import java.util.List;

public class TabTest extends BaseTest {

    @Test
    public void tabTestsMethods(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToWindowsPage();

        WindowsPage windowsPage = new WindowsPage(driver);
        windowsPage.dealTab();
        windowsPage.dealWindow();
        windowsPage.dealTabs();
    }
}
