package com.ria.steps;

import com.ria.actions.Assertions;
import com.ria.actions.MessageActions;
import com.ria.actions.SignInActions;
import com.ria.driver.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    SignInActions signInActions = new SignInActions();
    MessageActions messageActions = new MessageActions();
    Assertions messageAsserts = new Assertions();
    private static final String SIGN_IN_URL = "https://mail.google.com";

    @Before
    public void testsSetUp() {
        DriverProvider.getDriver().get(SIGN_IN_URL);
    }

    @Given("User signs in with {string} and {string}")
    public void userSignsInWithEmailAndPassword(String email, String password) {
        signInActions.signIn(email,password);
    }
    @When("User creates draft letter")
    public void userCreatesDraftLetter() {
        messageActions.createDraftLetter();
    }
    @And("User opens draft letter from the drafts folder")
    public void userOpensDraftLetterFromTheDraftsFolder() { messageActions.openDraftLetter(); }
    @Then("User check that letter data is correct")
    public void userCheckThatLetterDataIsCorrect() {
        messageAsserts.assertDraftLetterFieldsAreCorrect();
        messageActions.sendDraftLetter();
    }
    @After
    public void tearDown() {
        DriverProvider.closeDriver();
    }


}
