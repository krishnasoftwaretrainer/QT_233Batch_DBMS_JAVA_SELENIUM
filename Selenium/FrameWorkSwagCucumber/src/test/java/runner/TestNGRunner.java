package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// Annotation to configure Cucumber
@CucumberOptions(
		features = "src/test/resources/SwagFeatures/SwagLogin.feature",  // path to your .feature files
        glue = {"stepDefinitions","hooks"},                      // Path of step definition package
    plugin = {
        "pretty",                                   // Prints steps in console
        "html:target/cucumber-reports.html",        // Generates HTML report
         },
    monochrome = true                              // Makes console output readable
                
)

public class TestNGRunner extends AbstractTestNGCucumberTests
{

}
