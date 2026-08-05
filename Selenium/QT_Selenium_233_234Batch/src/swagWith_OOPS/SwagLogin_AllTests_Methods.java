package swagWith_OOPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLogin_AllTests_Methods {

	WebDriver driver;
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
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		SwagLogin_AllTests_Methods swagLogin = new SwagLogin_AllTests_Methods();
		
		swagLogin.SwagLogin("standard_user", "secret_sauce");
		swagLogin.SwagLogin("locked_out_user", "secret_sauce");
		swagLogin.SwagLogin("problem_user", "secret_sauce");
		swagLogin.SwagLogin("performance_glitch_user", "secret_sauce");
		swagLogin.SwagLogin("visual_user", "secret_sauce");
		swagLogin.SwagLogin("error_user", "secret_sauce");
	}
}
