package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    String url = ConfigurationReader.getProperty("webTableURL");

    @Given("user is already logged in to web table app")
    public void user_is_already_logged_in_to_web_table_app() {
        Driver.getDriver().get(url);
        webTableLoginPage.inputUsername.sendKeys("Test");
        webTableLoginPage.inputPassword.sendKeys("Tester");
        webTableLoginPage.loginButton.click();

    }

    @Then("user select product type {string}")
    public void user_select_product_type(String string) {

    }

    @Then("user enters quantity {string}")
    public void user_enters_quantity(String string) {

    }

    @Then("user enters customer name {string}")
    public void user_enters_customer_name(String string) {

    }

    @Then("user enters street {string}")
    public void user_enters_street(String string) {

    }

    @Then("user enters city {string}")
    public void user_enters_city(String string) {

    }

    @Then("user enters state {string}")
    public void user_enters_state(String string) {

    }

    @Then("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {

    }

    @Then("user select credit card type {string}:")
    public void user_select_credit_card_type(String string) {

    }

    @Then("user enters  credit card number {string}")
    public void user_enters_credit_card_number(String string) {

    }

    @Then("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {

    }

    @Then("user enters process order button")
    public void user_enters_process_order_button() {

    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

    }

}
