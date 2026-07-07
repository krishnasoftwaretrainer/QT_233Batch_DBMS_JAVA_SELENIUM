package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Cinfg_Headless 
{
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		 Thread.sleep(1000);  
		
		driver.manage().window().maximize();
		Thread.sleep(2000);  
		
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);  
		
		driver.close();
		
		System.out.println("Headless mode Executed");
	}

}
