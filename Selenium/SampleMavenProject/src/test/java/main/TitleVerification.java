package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		String expectedTitle = "Downloads | Selenium";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) 
		{
			System.out.println("Test Passed!");
		} 
		else 
		{
			System.out.println("Test Failed");
		}
		driver.quit();
	}

}
