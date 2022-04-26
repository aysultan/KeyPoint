package com.keyPoint.step_definitions;

import com.keyPoint.pages.AlertsPage;
import com.keyPoint.pages.BasePage;
import com.keyPoint.utilities.BrowserUtils;
import com.keyPoint.utilities.ConfigurationReader;
import com.keyPoint.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;



public class alertsStepDefs  extends BasePage {

    AlertsPage alertspage= new AlertsPage();


    @Given("the user is on the TOOLSQA main page")
    public void the_user_is_on_the_toolsqa_main_page() {
        Driver.get().get(ConfigurationReader.get("url1"));
    }

    @When("the user clicks on Alerts, Frame and Windows")
    public void the_user_clicks_on_alerts_frame_and_windows() {
       alertspage.clickAlertsFramesWindows();
    }

    @When("the user clicks on Alerts")
    public void the_user_clicks_on_alerts() {
        alertspage.clickAlerts();
    }

    @When("the user clicks on first Click me button")
    public void the_user_clicks_on_first_click_me_button() {
        alertspage.clickClickMe1();
    }

    @Then("You clicked a button message displayed")
    public void you_clicked_a_button_message_displayed() {

        Alert alert= Driver.get().switchTo().alert();
        alert.getText();
        Assert.assertEquals("You clicked a button",alert.getText());
        BrowserUtils.waitFor(2);

    }

    @And("the user clicks OK to make it disappear")
    public void the_user_clicks_ok_to_make_it_disappear() {

        Alert alert= Driver.get().switchTo().alert();

        alert.accept();

    }

    @When("the user clicks on second Click me button")
    public void the_user_clicks_on_second_click_me_button() {

        alertspage.clickClickMe2();

    }
    @Then("This alert appeared after {int} seconds message displayed")
    public void this_alert_appeared_after_seconds_message_displayed(Integer int1) {

        BrowserUtils.waitFor(5);
        Alert alert= Driver.get().switchTo().alert();
        BrowserUtils.waitFor(3);
        alert.getText();

        Assert.assertEquals("This alert appeared after 5 seconds",alert.getText());

    }


    @When("the user clicks on third Click me button")
    public void the_user_clicks_on_third_click_me_button() {

        alertspage.clickClickMe3();
    }



    @Then("Do you confirm action? message is displayed")
    public void do_you_confirm_action_message_is_displayed() {

        Alert alert= Driver.get().switchTo().alert();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Do you confirm action?",alert.getText());
    }
    @Then("the user sees You Selected OK message")
    public void the_user_sees_you_selected_ok_message() {

        alertspage.confirmResult3();
    }


    @When("the user clicks on fourth Click me button")
    public void the_user_clicks_on_fourth_click_me_button() {
        alertspage.clickClickMe4();

    }
    @Then("input box appears with Please enter your name message")
    public void input_box_appears_with_please_enter_your_name_message() {

        BrowserUtils.waitFor(2);

        Alert alert= Driver.get().switchTo().alert();

        BrowserUtils.waitFor(2);

        Assert.assertEquals("Please enter your name",alert.getText());

    }
    @Then("the user enters {string} in the input box")
    public void the_user_enters_in_the_input_box(String string) {

        Alert alert= Driver.get().switchTo().alert();

        alert.sendKeys(string);
    }

    @Then("the user sees You entered {string} message")
    public void the_user_sees_you_entered_message(String string) {

        String message="You entered "+string;
        BrowserUtils.waitFor(3);
        Assert.assertTrue(message,alertspage.clickMe4Result.isDisplayed());
    }



}
