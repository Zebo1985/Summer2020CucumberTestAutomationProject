package com.vytrack.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {
        "rerun:target/rerun.txt"
},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definition",
        dryRun =false,
        tags = "@login",
        publish = true
)
public class CucumberRunner {
}