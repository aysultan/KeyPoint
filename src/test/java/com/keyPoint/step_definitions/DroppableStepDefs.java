package com.keyPoint.step_definitions;

import com.keyPoint.pages.InteractionsPage;
import com.keyPoint.utilities.BrowserUtils;
import com.keyPoint.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class DroppableStepDefs {

    InteractionsPage interactionsPage=new InteractionsPage();
    @When("the user clicks Interactions")
    public void the_user_clicks_interactions() {
        BrowserUtils.scrollToElement(interactionsPage.interactions);
       interactionsPage.interactions.click();
    }

    @When("the user clicks Droppable")
    public void the_user_clicks_droppable() {
        BrowserUtils.scrollToElement(interactionsPage.droppableButton);

        interactionsPage.droppableButton.click();
    }

    @When("the user drags the box and drops into the dropbox")
    public void the_user_drags_the_box_and_drops_into_the_dropbox() {

        BrowserUtils.scrollToElement(interactionsPage.dragMe);

        Actions actions = new Actions(Driver.get());
        //actions.dragAndDrop(interactionsPage.dragMe,interactionsPage.dropHere);
        actions.moveToElement(interactionsPage.dragMe).clickAndHold().moveToElement(interactionsPage.dropHere).pause(2000).release().perform();


    }

    @Then("the user sees Dropped message on the dropbox")
    public void the_user_sees_dropped_message_on_the_dropbox() {

        BrowserUtils.waitForVisibility(interactionsPage.droppedText,5);
        Assert.assertTrue("Dropped!",interactionsPage.droppedText.isDisplayed());
    }


}
