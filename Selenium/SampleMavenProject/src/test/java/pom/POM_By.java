package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_By 
{
	 WebDriver driver;

		public POM_By(WebDriver driver) 
			{
				this.driver = driver;
			}
			
		By userName = By.id("user-name");
		By password = By.id("password");
		By loginButton = By.id("login-button");
		
		
		public void SwagLogin(String user, String pass) throws InterruptedException 
		{
		
			driver.findElement(userName).sendKeys(user);
			Thread.sleep(2000);
			driver.findElement(password).sendKeys(pass);
			Thread.sleep(2000);
			driver.findElement(loginButton).click();
			Thread.sleep(2000);
		}
		
		public boolean isErrorDisplayed() 
		{
			return driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed();
		}


}
