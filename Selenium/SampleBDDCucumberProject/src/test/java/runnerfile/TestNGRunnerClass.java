package runnerfile;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/FeatureFiles/AllSwagTestData.feature",  // path to your .feature files
        glue = {"stepDefinitions"}, 
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)

public class TestNGRunnerClass extends AbstractTestNGCucumberTests
{
	

}
