package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleVerification_TestNG 
{
	
	@Test
	public void titleVerification()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		String expectedTitle = "Downloads | Selenium 34324";
		String actualTitle = driver.getTitle();
		
		//Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
		
		SoftAssert sassert=new SoftAssert();
		sassert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
		
		driver.quit();
		sassert.assertAll();
	}

}
