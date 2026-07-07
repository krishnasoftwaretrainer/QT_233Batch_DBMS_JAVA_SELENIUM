package basic_SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLVerification {

	public static void main(String[] args) throws InterruptedException {
		// Excepted URL=https://www.saucedemo.com/
		// Actuval URL=
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		//driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		//String exceptedURL="https://www.saucedemo.COM/";
		String actvalURL=driver.getCurrentUrl();
		
		//System.out.println("ExceptedURL:"+exceptedURL);
		System.out.println("ActvalURL:"+actvalURL);
		
		//if(actvalURL.equals(exceptedURL))
		//if(actvalURL.equalsIgnoreCase(exceptedURL))
		//if(actvalURL.equalsIgnoreCase("https://www.saucedemo.COM/"))
		
		if(actvalURL.contains("www.saucedemo.com"))
		{
			System.out.println("Smoke Testing Pass");
		}
		else
		{
			System.out.println("Smoke Testing Fail");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
