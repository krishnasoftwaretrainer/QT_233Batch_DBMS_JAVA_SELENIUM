package workingWithWindows_Tabs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindow_Size_Position {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		Dimension size=new Dimension(900,900);
		driver.manage().window().setSize(size);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);	
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		Point pointv=new Point(600,300);
		driver.manage().window().setPosition(pointv);
		

	}

}
