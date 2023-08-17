package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Objects.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FrameTest extends Hooks {



    @Test
    public void FrameMethod(){

        FrameObject frameObject = new FrameObject(TestData);
        IndexPage indexPage = new IndexPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        indexPage.clickSkipSignIn();
        registerPage.goToFramePage();
        FramePage framePage = new FramePage(driver);
        framePage.dealSingleFrame(frameObject);
        framePage.dealMultipleFrames(frameObject);

    }
}
