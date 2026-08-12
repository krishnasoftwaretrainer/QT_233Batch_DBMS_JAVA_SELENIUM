package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class SwagAllTestDataLogin 
{
	
	WebDriver driver;
	@Given("The user is on the Swaglogin page")
	public void the_user_is_on_the_swaglogin_page() throws InterruptedException 
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

	}
	@When("The user enters a any username {string}")
	public void the_user_enters_a_any_username(String string) throws InterruptedException {

		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys(string);
		Thread.sleep(2000);
	}
	@When("The user enters a any password {string}")
	public void the_user_enters_a_any_password(String string) throws InterruptedException {
		WebElement password=driver.findElement(By.id("password"));
		   password.sendKeys(string);
		   Thread.sleep(2000);
	}
	@When("The user clicks the swaglogin button")
	public void the_user_clicks_the_swaglogin_button() throws InterruptedException {
		WebElement loginButton=driver.findElement(By.id("login-button"));
		   loginButton.click();
		   Thread.sleep(2000);
	}
	@Then("The user should be redirected to result page")
	public void the_user_should_be_redirected_to_result_page() 
	{
		WebElement productsPage=driver.findElement(By.xpath("//span[text()='Products']"));
		if(productsPage.isDisplayed())
		{
			System.out.println("The user is on the Products Page");
			
		}
		else
		{
			WebElement errorMessage=driver.findElement(By.xpath("//h3[@data-test='error']"));
			Assert.assertTrue(errorMessage.isDisplayed());
			System.out.println("Error Message: "+errorMessage.getText());
			
		}
		driver.quit();
	    }
	}


