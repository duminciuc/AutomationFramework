package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.RegisterObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement SwitchToDropdown;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement AlertsDropdown;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement FramesDropdown;

    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement WindowsDropdown;

    @FindBy(xpath = "//input[@ng-model=\"FirstName\"]")
    private WebElement FirstNameElement;
    @FindBy(xpath = "//input[@ng-model=\"LastName\"]")
    private WebElement LastNameElement;
    @FindBy(xpath = "//input[@ng-model=\"Address\"]")
    private WebElement AddressElement;
    @FindBy(xpath = "//input[@ng-model=\"Email\"]")
    private WebElement EmailElement;
    @FindBy(xpath = "//input[@ng-model=\"Phone\"]")
    private WebElement PhoneNoElement;

    @FindBy(css = "input[value='Male']")
    private WebElement GenderElement;
    @FindBy(css = "input[id='checkbox2']")
    private WebElement HobbiesElement;

    @FindBy(id = "yearbox")
    private WebElement YearDropdown;

    @FindBy(xpath = "//select[@placeholder='Month']")
    private WebElement MonthDropdown;

    @FindBy(id = "daybox")
    private WebElement DayDropdown;

    @FindBy(id = "msdd")
    private WebElement LanguagesDropdown;

    @FindBy(css = ".ui-front>li>a")
    private List<WebElement> LanguageOptions;

    @FindBy(css = ".select2-selection")
    private WebElement CountryList;

    @FindBy(className = "select2-search__field")
    private WebElement SelectCountryInput;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement MaleValue;

    @FindBy(xpath = "//input[@value='Hockey']")
    private WebElement HockeyValue;

    @FindBy(xpath = "//select[@id=\"Skills\"]")
    private WebElement Skills;

    @FindBy(xpath = "//input[@ng-model='Password']")
    private WebElement Password;

    @FindBy(xpath = "//input[@ng-model='CPassword']")
    private WebElement ConfirmPassword;

    @FindBy(id = "submitbtn")
    private  WebElement Submit;

    public void goToAlertPage(){
        elementMethods.hooverElement(SwitchToDropdown);
        elementMethods.clickElement(AlertsDropdown);
        pageMethods.NavigateToURL("https://demo.automationtesting.in/Alerts.html");
    }

    public void goToFramePage(){
        elementMethods.hooverElement(SwitchToDropdown);
        elementMethods.clickElement(FramesDropdown);
        pageMethods.NavigateToURL("https://demo.automationtesting.in/Frames.html");
    }

    public void goToWindowsPage(){
        elementMethods.hooverElement(SwitchToDropdown);
        elementMethods.clickElement(WindowsDropdown);
        pageMethods.NavigateToURL("https://demo.automationtesting.in/Windows.html");
    }

    public void RegisterProcess(RegisterObject registerObject)
    {
        elementMethods.fillElement(FirstNameElement,registerObject.getFirstnameValue());
        elementMethods.fillElement(LastNameElement,registerObject.getLastNameValue());
        elementMethods.fillElement(AddressElement,registerObject.getAddressValue());
        elementMethods.fillElement(EmailElement,registerObject.getEmailValue());
        elementMethods.fillElement(PhoneNoElement,registerObject.getPhoneNoValue());
        elementMethods.clickElement(GenderElement);
        elementMethods.clickElement(HobbiesElement);
        elementMethods.selectElementByValue(YearDropdown,registerObject.getYearValue());
        elementMethods.selectElementByText(MonthDropdown,registerObject.getMonthValue());
        elementMethods.selectElementByValue(DayDropdown,registerObject.getDayValue());
        LanguagesProcess(registerObject.getLanguagesValue());
        CountryProcess(registerObject.getCountryValue());

        elementMethods.selectElementByText(Skills,registerObject.getSkillsValue());

        elementMethods.clickElement(MaleValue);

        elementMethods.clickElement(HockeyValue);

        elementMethods.fillElement(Password,registerObject.getPasswordValue());

        elementMethods.fillElement(ConfirmPassword,registerObject.getConfirmPasswordValue());
    }

    public void LanguagesProcess(String languages){
        elementMethods.clickElement(LanguagesDropdown);

        for (int index = 0; index < LanguageOptions.size(); index++){
            if (LanguageOptions.get(index).equals(languages)){
                LanguageOptions.get(index).click();
            }
        }

        elementMethods.clickElement(FirstNameElement);
    }

    public void CountryProcess(String country){

        elementMethods.clickElement(CountryList);

        elementMethods.fillElement(SelectCountryInput,country);
        SelectCountryInput.sendKeys(Keys.ENTER);
    }

}
