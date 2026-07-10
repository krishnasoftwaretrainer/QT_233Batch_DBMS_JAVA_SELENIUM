package basic_SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_getAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://demo.automationtesting.in/Register.html");
		driver.get("https://www.saucedemo.com/");

		Thread.sleep(2000);

		/*
		 * //getAttribute Method WebElement
		 * firstname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")
		 * );
		 * 
		 * 
		 * firstname.sendKeys("Ramesh"); Thread.sleep(2000);
		 * 
		 * String enteredtext1=firstname.getAttribute("value");
		 * System.out.println("First EnteredText: "+enteredtext1);
		 * 
		 * firstname.clear(); Thread.sleep(2000); firstname.sendKeys("abcedfgh");
		 * 
		 * String enteredtext2=firstname.getAttribute("value");
		 * System.out.println("Second EnteredText: "+enteredtext2); Thread.sleep(2000);
		 * 
		 * //System.out.println("Placeholder: "+firstname.getAccessibleName());
		 * System.out.println("Class: "+firstname.getAttribute("class"));
		 */

		// getText Method
		WebElement username=driver.findElement(By.tagName("input"));
		username.sendKeys("djfgwkjgf");
		System.out.println("UserName: "+username.getAttribute("value"));
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("wwwwww");
		System.out.println("Password: "+password.getAttribute("value"));
		Thread.sleep(2000);
		
		WebElement Loginbutton = driver.findElement(By.id("login-button"));
		Loginbutton.click();
		Thread.sleep(2000);
		WebElement errormessage = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
		System.out.println("Error Message: " + errormessage.getText());
		Thread.sleep(2000);
		 driver.close();
	}

}
