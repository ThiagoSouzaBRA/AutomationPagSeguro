package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature/",
        glue = "Steps",
        dryRun = false,
        plugin = {"pretty", "html:test-output"}

)
public class Runner {

}
