package testNg_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

public class SwagLogin_TestNGAnnotations 
{
	WebDriver driver;
	
	@BeforeMethod
	//@BeforeTest
	//@BeforeClass
	public void BrowserConfig() throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test(priority=0) // Tests Case:1[Valid Valid]   //9am 5pm 8am 7pm 
	public void Swag_ValidLogin() throws InterruptedException  //WOR WOP 
	{
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("secret_sauce");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
			
	}
	
	@Test(priority=1) // Tests Case:2[InValid InValid]
	public void Swag_InValidLogin() throws InterruptedException  //WOR WOP 
	{
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("cvxfbxfbdf");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("yukyukuk");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);

	}
	
	@Test(priority=2)  // Tests Case:3[Blank Blank]
	public void Swag_BlankLogin() throws InterruptedException  //WOR WOP 
	{
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);

	}
	
	@AfterMethod
	//@AfterTest
	//@AfterClass
	public void BrowserTearDown()
	{
		
		if((driver!=null))
		{
			driver.quit();
			
		}
	}
	
	
	

}
