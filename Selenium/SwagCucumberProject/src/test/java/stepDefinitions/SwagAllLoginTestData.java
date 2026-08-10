package stepDefinitions;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SwagAllLoginTestData 
{
	WebDriver driver;
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException 
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@When("The user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String string) 
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys(string);
	}
	@When("The user enters a valid password {string}")
	public void the_user_enters_a_valid_password(String string) throws InterruptedException 
	{
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(string);
		Thread.sleep(2000);
	}
	@When("The user clicks the swag login button")
	public void the_user_clicks_the_swag_login_button() throws InterruptedException 
	{
		
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);
	}
	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() throws InterruptedException {
		String expectedUrl="https://www.saucedemo.com/inventory.html";
		String actualUrl=driver.getCurrentUrl();
		
		if (actualUrl.contains("inventory")) 
		{
		Assert.assertEquals(expectedUrl, actualUrl);

		} 
		else 
		{

			Assert.fail("Login failed. Expected URL: " + expectedUrl + ", but got: " + actualUrl);
		}
	Thread.sleep(2000);
	driver.quit();
	}

}
