package com.hepsiburada.step_definitions;

import com.hepsiburada.pages.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinitions {

    CategoryAndProductPage categoryAndProductPage = new CategoryAndProductPage();
    HomePage homePage = new HomePage();


    @Given("The user visits HepsiBurada homepage")
    public void the_user_visits_HepsiBurada_homepage() {
        homePage.gotoHomePage();
    }

    @And("The user verifies redirected to homepage")
    public void the_user_verifies_redirected_to_homepage() {
        HomePage.checkHomePage();
    }

    @When("The user verifies redirected to {string} page")
    public void the_user_verifies_redirected_to_page(String expUrl) {
        BasePage.verifyUrl(expUrl);
    }

    @When("The user clicks any product")
    public void the_user_clicks_any_product() {
        categoryAndProductPage.clickProductRandom();
    }

    @Given("The user fills {string} in the searchbox and click")
    public void the_user_fills_in_the_searchbox_and_click(String string) {
        homePage.searchBox(string);
    }

    @And("The user clicks Degerlendirmeler tab button")
    public void theUserClicksDegerlendirmelerTabButton() {
        categoryAndProductPage.clickDegerlendirmelerButton();
    }

    @And("The user clicks Yes button of first comment")
    public void theUserClicksYesButtonOfFirstComment() {
        categoryAndProductPage.clickYesButton();
    }

    @When("The user verifies {string} message")
    public void the_user_verifies_message(String message) {
        Assert.assertEquals(message.trim(), BasePage.verifyMessage(message));
    }
}
