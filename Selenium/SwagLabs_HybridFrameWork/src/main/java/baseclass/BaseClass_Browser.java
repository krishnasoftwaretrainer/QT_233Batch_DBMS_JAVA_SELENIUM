package baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import utitilities.Properties_URL;

public class BaseClass_Browser 
{
	public WebDriver driver;
	public Properties_URL propURL;  //Global Objects
	
	@BeforeMethod
	public void browserLaunch() throws IOException, InterruptedException {
		
		 propURL = new Properties_URL();  // ✅ constructor loads file

		    driver = new EdgeDriver();
		    driver.manage().window().maximize();
		  //driver.get("https://www.saucedemo.com/");  // ✅ hardcoded URL
		    driver.get(propURL.getApplicationURL("baseUrl")); 

		    Thread.sleep(2000);
		
	}

	@AfterMethod
	public void closeBrowser() throws IOException, InterruptedException 
	{

		Thread.sleep(2000);
		if (driver != null) {
			driver.quit();
		}
	}


}
