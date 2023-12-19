package com.demoa.tests;

import com.demoqa.pages.FramesPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
    }

    @Test
    public void iframesTest() {
        new SidePanel(driver).selectFrames();
        new FramesPage(driver).returnListOfFrame().switchToFrameByIndex(2);
    }

    @Test
    public void switchToIframeByIDTest(){
        new SidePanel(driver).selectFrames();
        new FramesPage(driver).switchToIframeByID();
    }

    @Test
    public void handleNestedIframesTest() {
        new SidePanel(driver).selectNesteFrames();
        new FramesPage(driver).handleNestedIframes();
    }
}
