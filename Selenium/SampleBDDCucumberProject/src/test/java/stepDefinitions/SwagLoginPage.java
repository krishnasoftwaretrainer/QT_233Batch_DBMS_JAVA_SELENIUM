package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class SwagLoginPage 
{
	WebDriver driver;
	
	@Given("The user is on the Login page")
	public void the_user_is_on_the_login_page() throws InterruptedException 
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

	}
	@When("The user enters a username {string}")
	public void the_user_enters_a_username(String string) throws InterruptedException 
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys(string);
		Thread.sleep(2000);
	}
	@And("The user enters a password {string}")
	public void the_user_enters_a_password(String string) throws InterruptedException 
	{
	   WebElement password=driver.findElement(By.id("password"));
	   password.sendKeys(string);
	   Thread.sleep(2000);
	}
	@And("The user clicks the Login button")
	public void the_user_clicks_the_login_button() throws InterruptedException 
	{
		
	   WebElement loginButton=driver.findElement(By.id("login-button"));
	   loginButton.click();
	   Thread.sleep(2000);
	}
	@Then("The user should see a Products Page")
	public void the_user_should_see_a_products_page() throws InterruptedException 
	{

		WebElement productsPage=driver.findElement(By.xpath("//span[text()='Products']"));
		Assert.assertTrue(productsPage.isDisplayed());
		
		System.out.println("The user is on the Products Page");
		Thread.sleep(2000);
		driver.quit();
	}

}
