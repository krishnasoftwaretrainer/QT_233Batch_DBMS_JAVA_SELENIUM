package testNg_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class SwagLogin 
{
	@Test(priority=0)  // Tests run: 1
	public void Swag_ValidLogin() throws InterruptedException  //WOR WOP 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("secret_sauce");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority=1,invocationCount=3)  // Tests run: 2 1/3 2/3 3/3
	public void Swag_InValidLogin() throws InterruptedException  //WOR WOP 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("cvxfbxfbdf");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("yukyukuk");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority=2,enabled=false)  // Tests run: 3
	public void Swag_BlankLogin() throws InterruptedException  //WOR WOP 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName=driver.findElement(By.tagName("input"));
		userName.sendKeys("");
		Thread.sleep(2000);
		
		 WebElement password =driver.findElement(By.name("password"));
		 password.sendKeys("");
		 Thread.sleep(2000);
		 
		WebElement loginbtn= driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		driver.quit();
	}

	
	/*
	public static void main(String[] args) throws InterruptedException 
	{
		SwagLogin swg=new SwagLogin();
		swg.Swag_ValidLogin();
		
	}  */
	

}
