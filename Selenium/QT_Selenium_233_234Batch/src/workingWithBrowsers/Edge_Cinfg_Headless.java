package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Edge_Cinfg_Headless 
{
	public static void main(String[] args) throws InterruptedException 
	{

		EdgeOptions options =new EdgeOptions();
		options.addArguments("--headless");
		WebDriver driver=new EdgeDriver(options);
		
		 Thread.sleep(2000);  
		 
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);  
		
		driver.close();
		
		System.out.println("Edge Headless mode Executed");

		
	}

}
