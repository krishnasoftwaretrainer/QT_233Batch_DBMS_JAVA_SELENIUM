package hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class Hooks 
{
	
	public static WebDriver driver;

	@Before
	public void BrowserSetup() throws IOException, InterruptedException {

		// Load properties file
		ConfigReader.loadProperties();

		// Launch Edge
		driver = new EdgeDriver();
		Thread.sleep(2000);
		// Maximize browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Get URL from properties file
		String url = ConfigReader.getProperty("swagurl");

		// Open application
		driver.get(url);
		Thread.sleep(2000);
	}

	@After
	public void BrowserTeardown() {

		if (driver != null) {
			driver.quit();
		}
	}
}
