package dataDrivenFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch() throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void BrowserClose() 
	{
		driver.close();
	}

}
