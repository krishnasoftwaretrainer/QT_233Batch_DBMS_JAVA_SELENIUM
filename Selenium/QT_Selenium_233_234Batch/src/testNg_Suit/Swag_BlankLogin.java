package testNg_Suit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Swag_BlankLogin  //Class-3
{
	
	WebDriver driver;

	@BeforeMethod
	public void BrowserConfig() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@Test // Tests Case:3[Blank Blank]
	public void Swag_BlankBlankLogin() throws InterruptedException // WOR WOP
	{

		WebElement userName = driver.findElement(By.tagName("input"));
		userName.sendKeys("");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("");
		Thread.sleep(2000);

		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void BrowserTearDown() {

		if ((driver != null)) {
			driver.quit();

		}
	}
}
