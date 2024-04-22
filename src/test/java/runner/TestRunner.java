package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/RegisterUser.feature",
        glue= {"utility","StepDefinition"},
        dryRun = false,
        plugin={"pretty","html:target/cucumber-reports"}//"html:target/cucumber-html-report","json:cucumber.json"}
)
public class TestRunner {

}
