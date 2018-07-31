import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"/Users/usachary/Documents/cucumberadvanced/src/test/resources/features/Registration.feature"},
        plugin = {"json:/Users/usachary/Documents/cucumberadvanced/target/cucumber-parallel/2.json", "html:/Users/usachary/Documents/cucumberadvanced/target/cucumber-parallel/2"},
        monochrome = false,
        tags = {},
        glue = {"steps"})
public class Parallel02IT {
}
