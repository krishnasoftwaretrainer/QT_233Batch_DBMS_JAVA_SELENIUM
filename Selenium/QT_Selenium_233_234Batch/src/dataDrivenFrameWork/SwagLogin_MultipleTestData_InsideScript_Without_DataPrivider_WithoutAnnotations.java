package dataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

public class SwagLogin_MultipleTestData_InsideScript_Without_DataPrivider_WithoutAnnotations 
{
	WebDriver driver;
	
	@Test(priority=0) // Tests Case:1[Valid Valid]   //9am 5pm 8am 7pm 
	public void Swag_ValidValidLogin() throws InterruptedException  //WOR WOP 
	{
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("secret_sauce");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		if((driver!=null))
		{
			driver.quit();
			
		}
			
	}
	
	@Test(priority=1) // Tests Case:2[InValid InValid]
	public void Swag_ValidInValidLogin() throws InterruptedException  //WOR WOP 
	{
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("invalid_pwd");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		if((driver!=null))
		{
			driver.quit();
			
		}

	}
	
	@Test(priority=2)  // Tests Case:3[Blank Blank]
	public void Swag_InvalidValidLogin() throws InterruptedException  //WOR WOP 
	{
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("invalid_user");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("secret_sauce");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		if((driver!=null))
		{
			driver.quit();
			
		}

	}
	
	@Test(priority=3)  // Tests Case:3[Blank Blank]
	public void Swag_InvalidInValidLogin() throws InterruptedException  //WOR WOP 
	{
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("invalid_user");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("invalid_pwd");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		if((driver!=null))
		{
			driver.quit();
			
		}

	}
	@Test(priority=4)  // Tests Case:3[Blank Blank]
	public void Swag_ValidBlankLogin() throws InterruptedException  //WOR WOP 
	{
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		if((driver!=null))
		{
			driver.quit();
			
		}

	}
	@Test(priority=5)  // Tests Case:3[Blank Blank]
	public void Swag_BlankValidLogin() throws InterruptedException  //WOR WOP 
	{
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("secret_sauce");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		if((driver!=null))
		{
			driver.quit();
			
		}

	}
	@Test(priority=6)  // Tests Case:3[Blank Blank]
	public void Swag_BlankLogin() throws InterruptedException  //WOR WOP 
	{
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		if((driver!=null))
		{
			driver.quit();
			
		}

	}


}
