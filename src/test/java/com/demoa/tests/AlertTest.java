package com.demoa.tests;

import com.demoqa.pages.AlertPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts().hideIframes();
    }


    @Test
    public void waitAlertTest() {
        new AlertPage(driver).clickOnAlertWithTimer();
    }

    @Test
    public void alertWithSelectTest() {
        new AlertPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlertTest(){
        new AlertPage(driver).sendMessageToAlert("Hello World!").verifyMessage("Hello World!");
    }
}
