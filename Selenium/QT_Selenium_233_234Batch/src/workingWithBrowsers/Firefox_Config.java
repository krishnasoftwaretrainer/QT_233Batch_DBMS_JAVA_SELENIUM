package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Config 
{
	
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new FirefoxDriver();
	 Thread.sleep(1000);  //Hold the execution 2s
	 
	//Step2:Maximize Browser
	driver.manage().window().maximize();
	Thread.sleep(2000);  //Hold the execution 2s
	
	//Step3:Enter URL 
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);  //Hold the execution 2s
	
	//Step4:Close Browser
	driver.close();
	
}
}
