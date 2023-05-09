package com.tutorialninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComponentsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllComponents')]")
    WebElement showAllComponents;

    public void mouseHoverOnComponentsAndClick(){
        CustomListeners.test.log(Status.PASS,"mouseHoverOnComponentsAndClick " + components);
        Reporter.log("mouseHoverOnComponentsAndClick " + components.toString());
        clickOnElement(components);

    }
    public void clickOnShowAllComponents() {
        CustomListeners.test.log(Status.PASS, "clickOnShowAllComponents " + showAllComponents);
        Reporter.log("clickOnShowAllComponents " + showAllComponents.toString());
        clickOnElement(showAllComponents);
    }
    }
