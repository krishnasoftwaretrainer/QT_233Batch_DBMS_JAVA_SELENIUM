package basic_SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		
		firstname.sendKeys("Krishna");
		Thread.sleep(2000);
		firstname.clear();
		Thread.sleep(2000);
		firstname.sendKeys("Ramesh");
		
		/*
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Krishna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Ramesh");
		*/
	}

}
