package com.tutorialninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCart extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qtyField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;


    public String getShoppingCartText() {
        CustomListeners.test.log(Status.PASS,"getShoppingCartText " + shoppingCartText);
        Reporter.log("getShoppingCartText " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName() {
        CustomListeners.test.log(Status.PASS,"getProductName " + productName);
        Reporter.log("getProductName " + productName.toString());
        return getTextFromElement(productName);
    }

    public String getDeliveryDate() {
        CustomListeners.test.log(Status.PASS,"getDeliveryDate " + deliveryDate);
        Reporter.log("getDeliveryDate " + deliveryDate.toString());
        return getTextFromElement(deliveryDate);
    }

    public String getModel() {
        CustomListeners.test.log(Status.PASS,"getModel " + model);
        Reporter.log("getModel " + model.toString());
        return getTextFromElement(model);
    }

    public String getTotal() {
        CustomListeners.test.log(Status.PASS,"getTotal " + total);
        Reporter.log("getTotal " + total.toString());
        return getTextFromElement(total);
    }

    public void changeQuantity(String qty) {
        CustomListeners.test.log(Status.PASS,"changeQuantity " + qtyField);
        Reporter.log("changeQuantity " + qtyField.toString());
        sendTextToElement(qtyField, qty);
    }

    public void clickOnQtyUpdateButton() {
        CustomListeners.test.log(Status.PASS,"clickOnQtyUpdateButton " + qtyUpdateBtn);
        Reporter.log("clickOnQtyUpdateButton " + qtyUpdateBtn.toString());
        clickOnElement(qtyUpdateBtn);
    }

    public String getSuccessModifiedMessage() {
        CustomListeners.test.log(Status.PASS,"getSuccessModifiedMessage " + successModifiedMessage);
        Reporter.log("getSuccessModifiedMessage " + successModifiedMessage.toString());
        return getTextFromElement(successModifiedMessage);
    }
}
