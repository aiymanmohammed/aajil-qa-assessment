package com.aajil.tests;

import com.aajil.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

    public String completePurchase(String from, String to) {

        HomePage home = new HomePage(driver);
        home.selectFromCity(from);
        home.selectToCity(to);
        home.clickFindFlights();

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFirstFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.fillForm("John Tester");
        purchase.clickPurchase();

        ConfirmationPage confirm = new ConfirmationPage(driver);
        return confirm.getStatus();
    }

    @Test
    public void TC01_Boston_Berlin() {
        String status = completePurchase("Boston", "Berlin");
        Assert.assertTrue(status.length() > 1, "Status should not be empty");
    }

    @Test
    public void TC02_Paris_BuenosAires() {
        String status = completePurchase("Paris", "Buenos Aires");
        Assert.assertTrue(status.length() > 1, "Status should not be empty");
    }
}
