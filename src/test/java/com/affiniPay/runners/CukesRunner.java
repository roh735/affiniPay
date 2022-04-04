package com.affiniPay.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports"},
        features = "src/test/resources/features/",
        glue = "com/affiniPay/step_definitions/",
        dryRun = false,
        tags = "@ui"
)
public class CukesRunner {
}
