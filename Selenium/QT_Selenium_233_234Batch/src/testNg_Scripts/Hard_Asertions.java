package testNg_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Asertions 
{
	
	@Test
	public void TitleVerification() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.get("https://www.selenium.dev/downloads/");	
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//String exceptedTitle="Downloads123 | Selenium";
		String exceptedTitle="Swag Labs Application";
		String actuvalTitle=driver.getTitle();
		
		System.out.println("ExceptedTitle:"+exceptedTitle);
		System.out.println("ActuvalTitle:"+actuvalTitle);
		Thread.sleep(2000);
		Assert.assertEquals(actuvalTitle, exceptedTitle,"Title Verification Fail");
		//Assert.assertNotEquals(actuvalTitle, exceptedTitle,"Title Verification Fail");
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("dgsdgsr");
		 Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys("fgsdfsdfs");
		 Thread.sleep(2000);
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(2000);
		
		WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
	    Assert.assertTrue(errorMsg.isDisplayed(), "Error message not displayed");
	    
	   
		driver.close();

		
	}

}
