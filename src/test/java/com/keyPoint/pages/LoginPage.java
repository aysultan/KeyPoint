package com.keyPoint.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "user-name")
    public WebElement usernameInput;

    @FindBy  (id = "password")
    public WebElement passwordInput;

    @FindBy (id = "login-button")
    public WebElement loginButton;

    @FindBy (xpath = "//span[.='Products']")
    public  WebElement productHeader;

    @FindBy(xpath = "//button[@class='error-button']")
    public  WebElement errorMessage;
}

