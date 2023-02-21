package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DataTable_StepDefinition {

    @Then("user should see the fruits I like")
    public void user_should_see_the_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);

    }

}
