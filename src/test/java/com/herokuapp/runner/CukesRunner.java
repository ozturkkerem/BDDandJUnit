package com.herokuapp.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={ "html:target/cucumber-report.html",
        },
        glue = "com/herokuapp/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@Regression"


)

public class CukesRunner {
}
