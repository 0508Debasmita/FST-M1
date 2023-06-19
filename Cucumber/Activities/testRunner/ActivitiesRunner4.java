package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
        tags = "@Activity4"
)
public class ActivitiesRunner4 {
    //empty
}