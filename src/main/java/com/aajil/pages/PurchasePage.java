package com.aajil.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage extends BasePage {

    private By nameField = By.id("inputName");
    private By addressField = By.id("address");
    private By cityField = By.id("city");
    private By stateField = By.id("state");
    private By zipField = By.id("zipCode");
    private By cardType = By.id("cardType");
    private By creditNumber = By.id("creditCardNumber");
    private By month = By.id("creditCardMonth");
    private By year = By.id("creditCardYear");
    private By nameOnCard = By.id("nameOnCard");
    private By purchaseBtn = By.cssSelector("input.btn-primary");

    public PurchasePage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String name) {
        type(nameField, name);
        type(addressField, "123 Main St");
        type(cityField, "TestCity");
        type(stateField, "TestState");
        type(zipField, "12345");
        type(creditNumber, "4111111111111111");
        type(month, "12");
        type(year, "2027");
        type(nameOnCard, name);
    }

    public void clickPurchase() {
        click(purchaseBtn);
    }
}
