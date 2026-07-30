package propertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwagData_Prop 
{
	@Test
	public void swagData() throws InterruptedException, IOException
	{
	//URL Locators TestData 
	WebDriver driver = new EdgeDriver();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	FileInputStream fis = new FileInputStream("src/propertiesFiles/SwagTestData.properties");
	
	Properties prop = new Properties();
	
	prop.load(fis);
	
	
	driver.get(prop.getProperty("swagurl"));
	
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.id(prop.getProperty("swagusernameL")));
	username.sendKeys(prop.getProperty("swagusername"));
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.name(prop.getProperty("swagpasswordL")));
	password.sendKeys(prop.getProperty("swagpassword"));
	Thread.sleep(2000);
	
	WebElement loginbtn = driver.findElement(By.id("login-button"));
	loginbtn.click();
	
	}
}
