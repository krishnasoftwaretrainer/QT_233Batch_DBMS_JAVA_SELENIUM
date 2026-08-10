package runnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/SwagLoginFeatures/SwagAllLogin.feature",  // path to your .feature files
        glue = {"stepDefinitions"},               // package containing step definitions
	           
plugin = {"pretty", "html:target/cucumber-report.html"},  // reports
        monochrome = true                    // readable console output
        
)

public class SwagOutlineRunner 
{
	

}
