package basic_SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Navigations {

	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
		//WebDriver driver = new ChromeDriver(options);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//Backward One Step
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Backward Two Steps
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Forward One Step
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Forward Two Steps
		driver.navigate().forward();  //Amazon
		Thread.sleep(2000);
		
		//ReFesh the Page
		driver.navigate().refresh();
		Thread.sleep(2000);
				
		if(driver!=null)  //true false
		{
		driver.close();
		System.out.println("if condition is executed");
		}
		
		System.out.println("Success");
		
	}

}
