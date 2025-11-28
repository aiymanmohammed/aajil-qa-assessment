package com.aajil.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservePage extends BasePage {

    private By firstFlightSelectBtn = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public ReservePage(WebDriver driver) {
        super(driver);
    }

    public void chooseFirstFlight() {
        click(firstFlightSelectBtn);
    }
}
