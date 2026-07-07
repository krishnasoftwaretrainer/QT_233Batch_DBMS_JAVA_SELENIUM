package workingWithBrowsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsers_Config_switch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Browser Name");
		String browser=scan.next().toLowerCase();
		
		switch(browser)
		{
		case "chrome":
		{
		driver=new ChromeDriver();
		 Thread.sleep(1000); 
		 driver.manage().window().maximize();
		Thread.sleep(2000); 
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000); 
		driver.close();
		System.out.println("Chrome Browser Executed");
		Thread.sleep(2000); 
		break;
		}
		
		case "edge":
		{
		driver=new EdgeDriver();
		 Thread.sleep(2000);  
		 driver.manage().window().maximize();
		Thread.sleep(2000);  
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);  
		driver.close();
		System.out.println("Edge Browser Executed");
		Thread.sleep(2000); 
		break;
		}
		
		case "firefox":
		{
			driver=new FirefoxDriver();
		 Thread.sleep(1000);  
		 driver.manage().window().maximize();
		Thread.sleep(2000); 
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);  
		driver.close();
		System.out.println("Firefox Browser Executed");
		break;
		}
		
		default:
		{
			System.out.println("Only Select above 3 browsers");
		}
		scan.close();
	}
	}
}
