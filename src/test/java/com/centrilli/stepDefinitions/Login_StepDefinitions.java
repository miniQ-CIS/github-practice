package com.centrilli.stepDefinitions;

import com.centrilli.pages.DiscussPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get("https://qa.centrilli.com/");

    }

    @When("user enter the email {string} into the email input box")
    public void user_enter_the_email_into_the_email_input_box(String string) {
        loginPage.emailInputBox.sendKeys(string);
    }

    @When("user enter the password {string} into the password input box")
    public void user_enter_the_password_into_the_password_input_box(String string) {
        loginPage.passwordInputBox.sendKeys(string);
    }

    @When("user click the Log in button that is located below the password input box")
    public void user_click_the_button_that_is_located_below_the_password_input_box() {
        loginPage.loginButton.click();
    }

    @Then("user should be able to verify that the title is")
    public void user_should_be_able_to_access_the_application_successfully() {

        String expectedTitle = "#Inbox - Odoo";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);


    }

}
