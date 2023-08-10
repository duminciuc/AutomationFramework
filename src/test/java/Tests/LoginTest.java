package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.LoginObject;
import Pages.IndexPage;
import Pages.SignInPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Hooks {

    @Test
    public void LoginMethod(){

        LoginObject loginObject = new LoginObject(TestData);

        IndexPage indexPage = new IndexPage(driver);

        indexPage.clickSignIn();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginInvalid(loginObject);
    }
}
