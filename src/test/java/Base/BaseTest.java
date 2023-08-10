package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void Setup(){

        //setare driver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //facem o instanta de chrome
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
    }

    @After
    public void ClearEnvironment(){
        driver.quit();

    }

}
