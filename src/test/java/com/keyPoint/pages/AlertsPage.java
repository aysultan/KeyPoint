package com.keyPoint.pages;

import com.keyPoint.utilities.BrowserUtils;
import com.keyPoint.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage{



    @FindBy(xpath = "//div[@class='card mt-4 top-card'][3]")
    public WebElement alertsFrameWindows;

    public void clickAlertsFramesWindows(){
        BrowserUtils.scrollToElement(alertsFrameWindows);
        alertsFrameWindows.click();
    }

    @FindBy(xpath = "//span[.='Alerts']")
    public WebElement alertsButton;

    public void clickAlerts(){
        BrowserUtils.scrollToElement(alertsButton);
        alertsButton.click();
    }


    @FindBy(id = "alertButton")
    public  WebElement clickMe1;

    public void clickClickMe1(){
        BrowserUtils.scrollToElement(clickMe1);
        clickMe1.click();
    }


    @FindBy (id = "timerAlertButton")
    public WebElement clickMe2;

    public  void clickClickMe2(){
        BrowserUtils.scrollToElement(clickMe2);
        clickMe2.click();
    }


    @FindBy (id = "confirmButton")
    public WebElement clickMe3;

    public  void clickClickMe3(){
        BrowserUtils.scrollToElement(clickMe3);
        clickMe3.click();
    }

    @FindBy (id = "confirmResult")
    public WebElement clickMe3Result;

    public  void confirmResult3(){
        Assert.assertTrue("You selected OK",clickMe3Result.isDisplayed());

    }


    @FindBy (xpath = "//button[@id='promtButton']")
    public WebElement clickMe4;

    public  void clickClickMe4(){
        BrowserUtils.scrollToElement(clickMe4);
        clickMe4.click();
    }

    @FindBy (id = "promptResult")
    public WebElement clickMe4Result;




}

