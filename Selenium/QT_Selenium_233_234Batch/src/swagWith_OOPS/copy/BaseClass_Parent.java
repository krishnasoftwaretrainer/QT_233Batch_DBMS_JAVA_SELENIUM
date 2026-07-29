package swagWith_OOPS.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass_Parent 
{
	public static WebDriver driver;

	@BeforeMethod
	
	public void BrowserConfig() throws InterruptedException {
		driver = new EdgeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/", "URL mismatch or page not loaded");
	}

	@AfterMethod

	public void BrowserTearDown() {

		if ((driver != null)) {
			driver.quit();

		}
	}

}
