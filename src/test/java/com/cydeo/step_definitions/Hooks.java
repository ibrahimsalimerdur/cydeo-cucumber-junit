package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before ("@student")
    public void setupScenario (){
        System.out.println("====Seting Up browser using cucumber @Before");
    }

    @After
    public void tearDownScenario (){
        Driver.closeDriver();
        // System.out.println("====Closing browser using cucumber @Before");
        //System.out.println("Scenario finished, take SS if fails");

    }

    @BeforeStep
    public void setupStep (){
        System.out.println("---> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep (){
        System.out.println("---> applying tearDown using @AfterStep");
    }




}
