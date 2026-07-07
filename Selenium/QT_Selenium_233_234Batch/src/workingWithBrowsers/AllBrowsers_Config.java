package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsers_Config 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		
		driver=new ChromeDriver();
		 Thread.sleep(1000); 
		 driver.manage().window().maximize();
		Thread.sleep(2000); 
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000); 
		driver.close();
		System.out.println("Chrome Browser Executed");
		Thread.sleep(2000); 
		
		driver=new EdgeDriver();
		 Thread.sleep(2000);  
		 driver.manage().window().maximize();
		Thread.sleep(2000);  
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);  
		driver.close();
		System.out.println("Edge Browser Executed");
		Thread.sleep(2000); 
		
		driver=new FirefoxDriver();
		 Thread.sleep(1000);  
		 driver.manage().window().maximize();
		Thread.sleep(2000); 
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);  
		driver.close();
		System.out.println("Firefox Browser Executed");
		
		
		/*
		WebDriver chrome=new ChromeDriver();
		 Thread.sleep(1000); 
		 chrome.manage().window().maximize();
		Thread.sleep(2000); 
		chrome.get("https://www.saucedemo.com/");
		Thread.sleep(2000); 
		chrome.close();
		System.out.println("Chrome Browser Executed");
		Thread.sleep(2000); 
		
		 WebDriver edge=new EdgeDriver();
		 Thread.sleep(2000);  
		 edge.manage().window().maximize();
		Thread.sleep(2000);  
		edge.get("https://www.facebook.com/");
		Thread.sleep(2000);  
		edge.close();
		System.out.println("Edge Browser Executed");
		Thread.sleep(2000); 
		
		WebDriver firfox=new FirefoxDriver();
		 Thread.sleep(1000);  
		 firfox.manage().window().maximize();
		Thread.sleep(2000); 
		firfox.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);  
		firfox.close();
		System.out.println("Firefox Browser Executed");
		*/

	}

}
