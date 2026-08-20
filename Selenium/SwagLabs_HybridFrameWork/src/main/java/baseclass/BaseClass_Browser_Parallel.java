package baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import utitilities.Properties_URL;

public class BaseClass_Browser_Parallel 
{
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();   public Properties_URL propURL;

	    // Getter for driver
	public WebDriver getDriver() {
	    return driver.get();
	}

	    @BeforeMethod
	    public void browserLaunch() throws IOException {

	        propURL = new Properties_URL();

	        WebDriver localDriver = new EdgeDriver();
	        localDriver.manage().window().maximize();
	        localDriver.get(propURL.getApplicationURL("baseUrl"));

	        driver.set(localDriver);  // ✅ Thread-specific driver
	    }

	    @AfterMethod
	    public void closeBrowser() {

	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove(); // ✅ Important (prevents memory leak)
	        }
	    }


}
