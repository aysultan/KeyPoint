package com.keyPoint.step_definitions;

import com.keyPoint.pages.LoginPage;
import com.keyPoint.utilities.BrowserUtils;
import com.keyPoint.utilities.ConfigurationReader;
import com.keyPoint.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();

    @Given("user is on the SWAGLABS login page")
    public void user_is_on_the_swaglabs_login_page() {

        Driver.get().get(ConfigurationReader.get("url2"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.usernameInput.sendKeys(username);

    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.passwordInput.sendKeys(password);

    }

    @When("user click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("user should see {string} header on the homepage")
    public void user_should_see_header_on_the_homepage(String header) {

        String expectedHeader=loginPage.productHeader.getText();
        Assert.assertEquals(header,expectedHeader);

    }
    @Then("user should see {string} message")
    public void user_should_see_message(String string) {


      String actualMessage=loginPage.errorMessage.getText();

        Assert.assertEquals(string,actualMessage);
    }

}
