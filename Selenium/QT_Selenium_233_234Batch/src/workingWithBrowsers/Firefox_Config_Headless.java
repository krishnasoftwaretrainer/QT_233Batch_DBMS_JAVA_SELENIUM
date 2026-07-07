package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_Config_Headless 
{
	
public static void main(String[] args) throws InterruptedException {
	
	FirefoxOptions options =new FirefoxOptions();
	options.addArguments("--headless");
	WebDriver driver=new FirefoxDriver(options);
	 Thread.sleep(1000);  
	 
	driver.manage().window().maximize();
	Thread.sleep(2000);  
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);  
	
	driver.close();
	
	System.out.println("Firefox Headless mode Executed");
}

}
