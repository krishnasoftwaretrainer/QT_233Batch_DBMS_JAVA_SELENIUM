package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;

	@BeforeMethod
	public void browserLaunch() throws IOException, InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
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
