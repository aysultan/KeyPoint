package com.keyPoint.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoverPage extends BasePage{
    @FindBy (xpath = "//div[@class='card mt-4 top-card'][4]")
    public WebElement widgets;

    @FindBy(xpath = "//div[@class='left-pannel']//div[@class='element-group'][4]")
    public WebElement widgetsDropDown;

    @FindBy (xpath = "//span[normalize-space()='Tool Tips']")

    public WebElement tooltips;

    @FindBy(css = "#toolTipButton")
    public WebElement hoverMeButton;

    @FindBy (css = "#texFieldToolTopContainer")
    public WebElement hoverMeField;

    @FindBy (css = "#buttonToolTip")
    public WebElement buttonText;

    @FindBy (css = "#textFieldToolTip")
    public WebElement textField;
}
