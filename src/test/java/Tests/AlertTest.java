package Tests;

import Base.BaseTest;
import Base.Hooks;
import Objects.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;

public class AlertTest extends Hooks {

    @Test
    public void AlertMethod() {

        AlertObject alertObject = new AlertObject(TestData);
        IndexPage indexPage = new IndexPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        indexPage.clickSkipSignIn();
        registerPage.goToAlertPage();
        AlertPage alertPage = new AlertPage(driver);
        alertPage.manageAlertOK();
        alertPage.manageAlertOKCancel();
        alertPage.manageAlertSendKeys(alertObject);

    }
}
