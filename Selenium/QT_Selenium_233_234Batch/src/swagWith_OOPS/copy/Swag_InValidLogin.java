package swagWith_OOPS.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Swag_InValidLogin extends BaseClass_Parent //Class-2
{


	@Test // Tests Case:2[InValid InValid]
	public void Swag_InValidInValidLogin() throws InterruptedException // WOR WOP
	{

		SoftAssert softAssert = new SoftAssert();
		
		WebElement userName = driver.findElement(By.tagName("input"));
		userName.sendKeys("cvxfbxfbdf");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("yukyukuk");
		Thread.sleep(2000);

		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		Thread.sleep(2000);
		
		WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
		softAssert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed");
	
		softAssert.assertAll();
	}
}
