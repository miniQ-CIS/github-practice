package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussPage {


    public DiscussPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//title[.='#Inbox - Odoo']")
    public WebElement discussPageTitle;
}
