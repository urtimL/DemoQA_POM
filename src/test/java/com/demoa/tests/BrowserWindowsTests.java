package com.demoa.tests;

import com.demoqa.pages.BrowserWindowsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTests extends TestBase{

    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectBrowserWindows();

    }

    @Test
    public void newTabTest() {
        new BrowserWindowsPage(driver).switchToNextTab(1).verifyTabTitle("sample");
    }
}
