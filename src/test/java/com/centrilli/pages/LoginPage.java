package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='login']")
    public WebElement emailInputBox;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;





}
