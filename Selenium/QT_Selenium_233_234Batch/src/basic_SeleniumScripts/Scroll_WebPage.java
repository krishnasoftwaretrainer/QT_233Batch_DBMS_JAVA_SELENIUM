package basic_SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_WebPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		/*
		//Vertical Scrolling
		//1.Up to Down
		js.executeScript("window.scrollBy(0,500)"); // Scroll down by 500 pixels
		Thread.sleep(2000);
		
		//2. Down to Up
		js.executeScript("window.scrollBy(0,-500)"); // Scroll down by 500 pixels
		Thread.sleep(2000);
		
		//3.Left to Right
		js.executeScript("window.scrollBy(500,0)"); // Scroll down by 500 pixels
		Thread.sleep(2000);
		
		//4.Right to Left
		js.executeScript("window.scrollBy(-500,0)"); // Scroll down by 500 pixels
		Thread.sleep(2000);
		
		//Both:Up to Down and Left to Right
		js.executeScript("window.scrollBy(500,500)"); // Scroll down by 500 pixels
		*/
		//Scroll to specific element
		WebElement Year=driver.findElement(By.id("yearbox"));
		js.executeScript("arguments[0].scrollIntoView(true);", Year);
	}

}
