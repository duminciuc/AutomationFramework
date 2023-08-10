package Tests;

import Base.Hooks;
import Objects.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;


import java.util.List;

public class RegisterTest extends Hooks {

    @Test
    public void registerMethod(){

        RegisterObject registerObject = new RegisterObject(TestData);
        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.RegisterProcess(registerObject);

    }
}
