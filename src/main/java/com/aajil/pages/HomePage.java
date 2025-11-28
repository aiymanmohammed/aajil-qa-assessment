package com.aajil.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By fromCity = By.name("fromPort");
    private By toCity = By.name("toPort");
    private By findFlightsBtn = By.cssSelector("input.btn-primary");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void selectFromCity(String city) {
        selectDropdown(fromCity, city);
    }

    public void selectToCity(String city) {
        selectDropdown(toCity, city);
    }

    public void clickFindFlights() {
        click(findFlightsBtn);
    }
}
