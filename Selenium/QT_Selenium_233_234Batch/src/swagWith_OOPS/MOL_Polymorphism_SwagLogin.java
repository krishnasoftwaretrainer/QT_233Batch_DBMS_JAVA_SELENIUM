package swagWith_OOPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MOL_Polymorphism_SwagLogin 
{

	WebDriver driver;
	public void SwagLogin() throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	
		WebElement userName = driver.findElement(By.tagName("input"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		
	}
	
	public void SwagLogin(String Password) throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Password);
		Thread.sleep(2000);
		
	}
	public void SwagLogin(String UserName,String Password) throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	
		WebElement userName = driver.findElement(By.tagName("input"));
		userName.sendKeys(UserName);
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Password);
		Thread.sleep(2000);

		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(3000);
		driver.close();
	}
		
	
	public static void main(String[] args) throws InterruptedException {
	
		MOL_Polymorphism_SwagLogin swag = new MOL_Polymorphism_SwagLogin();
		//swag.SwagLogin();
		//swag.SwagLogin("Krishna");
		swag.SwagLogin("standard_user", "secret_sauce");
	}

}
