package com.tutorialninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class AccountRegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement passwordConfirmField;

    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    WebElement subscribeRadios;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueBtn;
    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    public String getRegisterAccountText() {
        CustomListeners.test.log(Status.PASS,"Get Register Account Text");
        Reporter.log("Get Register Account Text " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String fName) {
        CustomListeners.test.log(Status.PASS,"Enter First Name");
        Reporter.log("Enter First Name " + firstNameField.toString());

        sendTextToElement(firstNameField, fName);
    }

    public void enterLastName(String lName) {
        CustomListeners.test.log(Status.PASS,"Enter Last Name");
        Reporter.log("Enter Last Name " + lastNameField.toString());
        sendTextToElement(lastNameField, lName);
    }

    public void enterEmail(String email) {
        CustomListeners.test.log(Status.PASS,"Enter Email");
        Reporter.log("Enter Email " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String telephone) {
        CustomListeners.test.log(Status.PASS,"Enter Telephone");
        Reporter.log("Enter Telephone " + telephoneField.toString());
        sendTextToElement(telephoneField, telephone);
    }

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS,"Enter Password");
        Reporter.log("Enter Password " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String cPassword) {
        sendTextToElement(passwordConfirmField, cPassword);
        CustomListeners.test.log(Status.PASS,"Enter Confirm Password");
        Reporter.log("Enter Confirm Password " + passwordConfirmField.toString());
        //      sendTextToElement(passwordConfirmField, cPassword);
    }

    public void selectSubscription(String option) {
        CustomListeners.test.log(Status.PASS,"Select Subscription");
        Reporter.log("Select Subscription " + passwordConfirmField.toString());

        List<WebElement> radioButtons = getListOfElements(By.xpath("//fieldset[3]//input"));
        for (WebElement e : radioButtons) {
            if (e.getText().equals(option)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnPrivacyPolicyCheckBox() {
        CustomListeners.test.log(Status.PASS,"clickOnPrivacyPolicyCheckBox");
        Reporter.log("clickOnPrivacyPolicyCheckBox " + privacyPolicyCheckBox.toString());
        clickOnElement(privacyPolicyCheckBox);
    }

    public void clickOnContinueButton() {
        CustomListeners.test.log(Status.PASS,"clickOnContinueButton");
        Reporter.log("clickOnContinueButton " + continueBtn.toString());
        clickOnElement(continueBtn);
    }


}
