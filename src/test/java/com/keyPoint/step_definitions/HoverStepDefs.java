package com.keyPoint.step_definitions;

import com.keyPoint.pages.HoverPage;
import com.keyPoint.utilities.BrowserUtils;
import com.keyPoint.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class HoverStepDefs {
    HoverPage hoverPage=new HoverPage();
    @When("the user clicks on Widgets")
    public void the_user_clicks_on_widgets() {

        BrowserUtils.scrollToElement(hoverPage.widgets);
        hoverPage.widgets.click();
    }

    @When("the user clicks on ToolTips")
    public void the_user_clicks_on_tool_tips() {

       // hoverPage.widgetsDropDown.click();

       // BrowserUtils.waitFor(10);

        BrowserUtils.scrollToElement(hoverPage.tooltips);

        hoverPage.tooltips.click();


    }

    @When("the user hovers on the green button")
    public void the_user_hovers_on_the_green_button() {
        BrowserUtils.hover(hoverPage.hoverMeButton);

        BrowserUtils.waitForVisibility(hoverPage.buttonText,10);

    }

    @Then("the user should see {string} message next to the green  button")
    public void the_user_should_see_message_next_to_the_green_button(String string) {

        Assert.assertEquals(string,hoverPage.buttonText.getText());

    }

    @When("the user hovers  on the text field")
    public void the_user_hovers_on_the_text_field() {


        BrowserUtils.hover(hoverPage.hoverMeField);
        BrowserUtils.waitForVisibility(hoverPage.textField,10);
    }

    @Then("the user should see {string} message")
    public void the_user_should_see_message(String string) {


        Assert.assertEquals(string,hoverPage.textField.getText());

    }

}
