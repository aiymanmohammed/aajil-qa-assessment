package com.aajil.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage extends BasePage {

    private By statusText = By.cssSelector("table tr:nth-child(1) td:nth-child(2)");

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public String getStatus() {
        waitForElement(statusText);
        return driver.findElement(statusText).getText();
    }
}
