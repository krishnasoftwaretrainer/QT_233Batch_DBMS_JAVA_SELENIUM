package testNg_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void TitleVerification() throws InterruptedException
	{
		
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	 // ----------- ENTER INVALID CREDENTIALS -----------
    driver.findElement(By.id("user-name")).sendKeys("wrong_user");
    driver.findElement(By.id("password")).sendKeys("wrong_pass");
    driver.findElement(By.id("login-button")).click();

    // ----------- ASSERTIONS START -----------

    // 1. assertTrue → Error message displayed
    WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
    Assert.assertTrue(errorMsg.isDisplayed(), "Error message not displayed");

 // 2. assertEquals → Exact error text validation
    String expectedError = "Epic sadface: Username and password do not match any user in this service";
    String actualError = errorMsg.getText();
    Assert.assertEquals(actualError, expectedError, "Error message mismatch");

    // 3. assertNotEquals → Title should NOT be Products page
    String actualTitle = driver.getTitle();
    Assert.assertNotEquals(actualTitle, "Products", "User should not login successfully");

    // 4. assertFalse → URL should NOT contain inventory page
    Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),
            "User wrongly navigated to inventory page");
    
 // 5. assertNotNull → Login button exists
    WebElement loginBtn = driver.findElement(By.id("login-button"));
    Assert.assertNotNull(loginBtn, "Login button not found");

}	
}
