package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    /*@When("user types {word} and clicks enter")
    public void user_types_and_clicks_enter2(String searchKeyword) {
        googleSearchPage.cookieManagement.click();
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }


    @Then("user sees {word} in the google title")
    public void user_sees_in_the_google_title2(String anything) {
        String expectedTitle = anything+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

     */

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googleSearchPage.cookieManagement.click();
        googleSearchPage.searchBox.sendKeys(searchKeyword+ Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle = string+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

     @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {
        googleSearchPage.cookieManagement.click();
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }



    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }



}
