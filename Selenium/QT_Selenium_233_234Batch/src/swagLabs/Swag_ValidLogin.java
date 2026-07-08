package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_ValidLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		String actvalURL = driver.getCurrentUrl();

		if (actvalURL.contains("www.saucedemo.com")) // true
		{

			driver.findElement(By.tagName("input")).sendKeys("standard_user");
			 Thread.sleep(2000);
			 //driver.findElement(By.tagName("input")).sendKeys("secret_sauce");
			 driver.findElement(By.name("password")).sendKeys("secret_sauce");
			 Thread.sleep(2000);
			 driver.findElement(By.id("login-button")).click();
			 
			 
			// driver.findElement(By.id("user-name")).sendKeys("standard_user");
			// Thread.sleep(2000);
			// driver.findElement(By.name("password")).sendKeys("secret_sauce");

			/*
			 * Step5:Enter Valid Username Ste Step6:Enter Valid Password Ste Step7:Click on
			 * Login Button Ste Step8:Validate TC[Pass/Fail]
			 * 
			 */
		} else 
		{
			System.out.println("Smoke Testing Fail");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
