package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalLetters {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("selenium");
	
		//WebElement gsearch=driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
	
		//WebElement gsearch=driver.findElement(By.id("APjFqb"));
	/*	
	gsearch.sendKeys("selenium");
	Thread.sleep(2000);
	gsearch.clear();
	Thread.sleep(2000);
	//gsearch.sendKeys("Automation");
	gsearch.sendKeys("AUTOMATION");
	*/
	Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));

		//1.Press Shift 2.Type 3.Release Shift 
		Actions action=new Actions(driver);
		//action.keyDown(gsearch, Keys.SHIFT).sendKeys("automation").keyUp(Keys.SHIFT).build().perform();
		action.keyDown(firstname, Keys.SHIFT).sendKeys("automation").keyUp(Keys.SHIFT).build().perform();
		//firstname.sendKeys("automation");
		//firstname.sendKeys("AUTIOMATION");
	}

}
