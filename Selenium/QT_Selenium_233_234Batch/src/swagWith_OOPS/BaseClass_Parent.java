package swagWith_OOPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass_Parent 
{
	public static WebDriver driver;

	@BeforeMethod
	public void BrowserConfig() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@AfterMethod
	public void BrowserTearDown() {

		if ((driver != null)) {
			driver.quit();

		}
	}

}
