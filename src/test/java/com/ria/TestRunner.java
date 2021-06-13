package com.ria;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(features = {"src/test/resources/com.ria/gmailtest.feature"},
            glue = {"com/ria/steps"} )

    public class TestRunner extends AbstractTestNGCucumberTests {
    }
