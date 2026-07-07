package basic_SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/downloads/");

		Thread.sleep(2000);
		
		String exceptedTitle="Downloads | Selenium";
		
		String actuvalTitle=driver.getTitle();
		
		System.out.println("ExceptedTitle:"+exceptedTitle);
		System.out.println("ActuvalTitle:"+actuvalTitle);
		
		if(exceptedTitle.equalsIgnoreCase(actuvalTitle))
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
