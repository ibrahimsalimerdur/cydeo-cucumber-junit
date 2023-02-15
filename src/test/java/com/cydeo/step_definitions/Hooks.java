package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setupScenario (){
        System.out.println("====Seting Up browser using cucumber @Before");
    }

    @After
    public void tearDownScenario (){
        System.out.println("====Closing browser using cucumber @Before");
    }

}
