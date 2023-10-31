package com.herokuapp.step_definitions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.herokuapp.pages.Challenging_DOM;
import com.herokuapp.pages.Dynamic_Page;
import com.herokuapp.pages.TestPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Test_Step_Definitions {

    TestPage testPage = new TestPage();
    Dynamic_Page dynamic_page = new Dynamic_Page();
    Challenging_DOM challenging_dom = new Challenging_DOM();


    @Given("the user is on the-internet.herokuapp.com")
    public void the_user_is_on_the_internet_herokuapp_com() {

        testPage.userOnTheHerokuPage();

    }

    @When("the user clicks on Dynamic Controls")
    public void the_user_clicks_on_Dynamic_Controls() {

        testPage.clickDynamicControl();
    }


    @When("the user clicks on Remove")
    public void the_user_clicks_on_remove() {
        dynamic_page.clickRemoveButton();
    }

    @Then("the text It's Gone! should be rendered")
    public void the_text_should_be_rendered() {

        dynamic_page.checkItIsGoneMessage();
    }


    @When("the user clicks on Challenging DOM")
    public void the_user_clicks_on_challenging_dom() {
        testPage.challenging_DOM.click();
    }

    @Then("the user clicks on the Red button and ids should change")
    public void the_user_clicks_on_the_red_button_and_ids_should_change() {

        challenging_dom.checkIdsAreDifferent();


    }

}
