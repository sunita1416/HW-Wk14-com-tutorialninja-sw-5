package com.tutorialninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountLoginPage extends Utility {
    //    By loginBtn = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    public String getReturningCustomerText() {
        //   return getTextFromElement(returningCustomerText);
        CustomListeners.test.log(Status.PASS,"Get Returning Customer Text");
        Reporter.log("Get Returning Customer Text " + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);

    }

    public String getNewCustomerText() {
        CustomListeners.test.log(Status.PASS,"Get New Customer Text");
        Reporter.log("Get New Customer Text " + newCustomerText.toString());
        return getTextFromElement(newCustomerText);


    }

    public void enterEmailAddress(String email) {
        CustomListeners.test.log(Status.PASS,"enterEmailAddress");
        Reporter.log("enterEmailAddress " + emailAddressField.toString());
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS,"enterPassword");
        Reporter.log("enterPassword " + passwordField.toString());

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        CustomListeners.test.log(Status.PASS,"Click On Login Button");
        Reporter.log("Click On Login Button " + loginBtn.toString());


        clickOnElement(loginBtn);
    }


}
