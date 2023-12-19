package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="timerAlertButton")
    WebElement timerAlertButton;


    public AlertPage clickOnAlertWithTimer() {
        click(timerAlertButton);
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;

    public AlertPage selectResult(String confirm) {
        click(confirmButton);

        if(confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        } else  if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }

        return this;
    }


    @FindBy(id = "confirmResult")
    WebElement confirmResult;

    public AlertPage verifyResult(String result) {
        Assert.assertTrue(confirmResult.getText().contains(result));

        return this;
    }


    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertPage sendMessageToAlert(String message) {
        clickWithJSExecutor(promtButton, 0, 100);

        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();

        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public AlertPage verifyMessage(String text) {
        Assert.assertTrue(promptResult.getText().contains(text));
        return this;
    }
}
