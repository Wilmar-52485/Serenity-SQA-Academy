package com.demoblaze.stepDefinitions;

import com.demoblaze.tasks.HomeTask;
import com.demoblaze.tasks.RegisterTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterStepDefinitions {
    @Managed(driver = "Edge")
    private WebDriver browser;

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("that the user opens  the demo page and opens the registration option")
    public void thatTheUserOpensTheDemoPageAndOpensTheRegistrationOption() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.demoblaze.com"),
                HomeTask.on()
        );

    }
    @When("the user enters the registration data appropriately")
    public void theUserEntersTheRegistrationDataAppropriately() {
        theActorCalled("User").wasAbleTo(
                RegisterTask.on(browser)
        );
    }
    @Then("you will be able to see a successful registration message")
    public void youWillBeAbleToSeeASuccessfulRegistrationMessage() {
    }
}
