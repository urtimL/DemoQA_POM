package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".card:nth-child(3)")
    WebElement alertFrameWindows;

    public SidePanel getAlertsFrameWindows() {
        clickWithJSExecutor(alertFrameWindows, 0, 300);
        return new SidePanel(driver);
    }

    @FindBy(css=".card:nth-child(4)")
    WebElement widgets;

    public SidePanel getWidgets() {
        clickWithJSExecutor(widgets, 0, 300);
        return new SidePanel(driver);
    }

    @FindBy(css=".card:nth-child(2)")
    WebElement forms;

    public SidePanel getForms() {
        clickWithJSExecutor(forms, 0, 300);
        return new SidePanel(driver);
    }

    @FindBy(css=".card:nth-child(1)")
    WebElement elements;

    public SidePanel getElements() {
        clickWithJSExecutor(elements, 0, 300);
        return new SidePanel(driver);
    }
}
