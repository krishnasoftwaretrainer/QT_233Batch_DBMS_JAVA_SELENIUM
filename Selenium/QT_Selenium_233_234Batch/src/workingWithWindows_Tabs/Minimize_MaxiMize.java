package workingWithWindows_Tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_MaxiMize 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

}
