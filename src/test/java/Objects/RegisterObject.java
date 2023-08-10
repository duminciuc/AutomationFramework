package Objects;

import java.io.StringBufferInputStream;
import java.util.HashMap;

public class RegisterObject {

    private String FirstNameValue;
    private String LastNameValue;
    private String AddressValue;
    private String EmailValue;
    private String PhoneNoValue;
    private String YearValue;
    private String MonthValue;
    private String DayValue;
    private String LanguagesValue;
    private String CountryValue;
    private String SkillsValue;
    private String PasswordValue;
    private String ConfirmPasswordValue;

    public RegisterObject(HashMap<String,String> TestData){
        PrepareData(TestData);
    }

    public void PrepareData(HashMap<String,String> TestData ){
        for(String Key:TestData.keySet()){
            switch (Key){
                case "FirstNameValue":
                    setFirstnameValue(TestData.get(Key));
                    break;
                case "LastNameValue":
                    setLastNameValue(TestData.get(Key));
                    break;
                case "AddressValue":
                    setAddressValue(TestData.get(Key));
                    break;
                case "EmailValue":
                    setEmailValue(TestData.get(Key));
                    break;
                case "PhoneNoValue":
                    setPhoneNoValue(TestData.get(Key));
                    break;
                case "YearValue":
                    setYearValue(TestData.get(Key));
                    break;
                case "MonthValue":
                    setMonthValue(TestData.get(Key));
                    break;
                case "DayValue":
                    setDayValue(TestData.get(Key));
                    break;
                case "LanguagesValue":
                    setLanguagesValue(TestData.get(Key));
                    break;
                case "CountryValue":
                    setCountryValue(TestData.get(Key));
                    break;
                case "SkillsValue":
                    setSkillsValue(TestData.get(Key));
                    break;
                case "PasswordValue":
                    setPasswordValue(TestData.get(Key));
                    break;
                case "ConfirmPasswordValue":
                    setConfirmPasswordValue(TestData.get(Key));
                    break;

            }
        }
    }

    public String getFirstnameValue() {
        return FirstNameValue;
    }

    public void setFirstnameValue(String firstnameValue) {
        FirstNameValue = firstnameValue;
    }

    public String getLastNameValue() {
        return LastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        LastNameValue = lastNameValue;
    }

    public String getAddressValue() {
        return AddressValue;
    }

    public void setAddressValue(String addressValue) {
        AddressValue = addressValue;
    }

    public String getEmailValue() {
        return EmailValue;
    }

    public void setEmailValue(String emailValue) {
        EmailValue = emailValue;
    }

    public String getPhoneNoValue() {
        return PhoneNoValue;
    }

    public void setPhoneNoValue(String phoneNoValue) {
        PhoneNoValue = phoneNoValue;
    }

    public String getYearValue() {
        return YearValue;
    }

    public void setYearValue(String yearValue) {
        YearValue = yearValue;
    }

    public String getMonthValue() {
        return MonthValue;
    }

    public void setMonthValue(String monthValue) {
        MonthValue = monthValue;
    }

    public String getDayValue() {
        return DayValue;
    }

    public void setDayValue(String dayValue) {
        DayValue = dayValue;
    }

    public String getLanguagesValue() {
        return LanguagesValue;
    }

    public void setLanguagesValue(String languagesValue) {
        LanguagesValue = languagesValue;
    }

    public String getCountryValue() {
        return CountryValue;
    }

    public void setCountryValue(String countryValue) {
        CountryValue = countryValue;
    }

    public String getSkillsValue() {
        return SkillsValue;
    }

    public void setSkillsValue(String skillsValue) {
        SkillsValue = skillsValue;
    }

    public String getPasswordValue() {
        return PasswordValue;
    }

    public void setPasswordValue(String passwordValue) {
        PasswordValue = passwordValue;
    }

    public String getConfirmPasswordValue() {
        return ConfirmPasswordValue;
    }

    public void setConfirmPasswordValue(String confirmPasswordValue) {
        ConfirmPasswordValue = confirmPasswordValue;
    }
}
