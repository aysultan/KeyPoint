package com.keyPoint.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractionsPage extends BasePage{

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][5]")
    public WebElement interactions;

    @FindBy(xpath = "//span[.='Droppable']")
    public WebElement droppableButton;

    @FindBy (xpath = "//div[.='Drag me']")
    public WebElement dragMe;

    @FindBy (xpath = "(//div[@class='drop-box ui-droppable'])[1]")
    public WebElement dropHere;

    @FindBy(xpath = "//p[.='Dropped!']")
    public WebElement droppedText;
}
