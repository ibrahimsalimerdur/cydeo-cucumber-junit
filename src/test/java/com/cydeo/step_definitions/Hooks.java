package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before("@student")
    public void setupScenario() {
        System.out.println("====Seting Up browser using cucumber @Before");
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

       // Driver.closeDriver();
        // System.out.println("====Closing browser using cucumber @Before");
        //System.out.println("Scenario finished, take SS if fails");

    }

    @BeforeStep
    public void setupStep() {
        System.out.println("---> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("---> applying tearDown using @AfterStep");
    }


}
