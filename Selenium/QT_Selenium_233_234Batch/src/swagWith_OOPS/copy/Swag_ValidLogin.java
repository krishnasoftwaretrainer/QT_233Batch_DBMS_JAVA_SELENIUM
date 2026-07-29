package swagWith_OOPS.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Swag_ValidLogin extends BaseClass_Parent  //Class-1
{

	@Test // Tests Case:1[Valid Valid] //9am 5pm 8am 7pm
	public void Swag_ValidValidLogin() throws InterruptedException // WOR WOP
	{
		SoftAssert softAssert = new SoftAssert();

		WebElement userName = driver.findElement(By.tagName("input"));
		Assert.assertTrue(userName.isDisplayed(), "UserName field is not displayed");
		
		userName.sendKeys("standard_user1");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);

		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Login failed or URL mismatch");
		//softAssert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Login failed or URL mismatch");
		
		WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(2000);
		
		softAssert.assertAll();

	}



}
