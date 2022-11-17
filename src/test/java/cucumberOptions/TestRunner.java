package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Login",
        features = "src/test/java/features",
        glue = "stepDefinitions"
)
public class TestRunner {

}
