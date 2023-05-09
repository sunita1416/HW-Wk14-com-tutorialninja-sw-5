package com.tutorialninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    /*By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");*/

    public String getWelcomeText(){
        CustomListeners.test.log(Status.PASS,"getWelcomeText " + welcomeText);
        Reporter.log("getWelcomeText " + welcomeText.toString());
        String message = getTextFromElement(welcomeText);
        return message;
    }

    public void enterEmailId(String email){
        CustomListeners.test.log(Status.PASS,"enterEmailId " + emailField);
        Reporter.log("enterEmailId " + emailField.toString());
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + email);
    }

    public void enterPassword(String password){
        CustomListeners.test.log(Status.PASS,"enterPassword " + passwordField);
        Reporter.log("enterPassword " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"Enter Password " + password);
    }

    public void clickOnLoginButton(){
        CustomListeners.test.log(Status.PASS,"clickOnLoginButton " + loginButton);
        Reporter.log("clickOnLoginButton " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }

    public String getErrorMessage(){
        CustomListeners.test.log(Status.PASS,"getErrorMessage " + errorMessage);
        Reporter.log("getErrorMessage " + errorMessage.toString());
        String message = getTextFromElement(errorMessage);
        CustomListeners.test.log(Status.PASS,"Get errorMessage");
        return message;
    }
    }

