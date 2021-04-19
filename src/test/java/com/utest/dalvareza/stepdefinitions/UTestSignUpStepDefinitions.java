package com.utest.dalvareza.stepdefinitions;

import com.utest.dalvareza.exceptions.WelcomeMessageNotFoundException;
import com.utest.dalvareza.model.UtestForm;
import com.utest.dalvareza.questions.WelcomePage;
import com.utest.dalvareza.tasks.FillSignUpForm;
import com.utest.dalvareza.tasks.OpenUp;
import com.utest.dalvareza.userinterface.UTestHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class UTestSignUpStepDefinitions {

    @Given("that (.*) is in the registration form$")
    public void thatDiegoIsInTheRegistrationForm(String diego) {
        theActorCalled(diego).wasAbleTo(
                OpenUp.theUtestPage(),
                Click.on(UTestHomePage.SIGNUP_BUTTON)
        );
    }

    @When("^He fills all the registration form steps$")
    public void heFillsAllTheRegistrationFormSteps(List<UtestForm> formData) {
        theActorInTheSpotlight().attemptsTo(
                FillSignUpForm.withData(formData.get(0))
        );
    }

    @Then("^he sees the welcome message page$")
    public void heSeesTheWelcomeMessagePage() {
        theActorInTheSpotlight().should(
                seeThat("The welcome message",
                        WelcomePage.title(),
                        equalTo("Welcome to the world's largest community of freelance software testers!"))
                        .orComplainWith(WelcomeMessageNotFoundException.class, WelcomeMessageNotFoundException.WELCOME_MESSAGE_NOT_FOUND)
        );
    }
}
