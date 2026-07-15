package alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFrames {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frames.html");
		Thread.sleep(2000);
		
		//Switch to Frame-1
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		//Enter Text in Frame1 TextBox
		WebElement Textbox1=driver.findElement(By.id("001"));
		Textbox1.sendKeys("Krishna");
		Thread.sleep(2000);
		
		//Switch to Default 
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//Switch to Frame-2
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		
		//Enter Text in Frame2 TextBox
		WebElement Textbox2=driver.findElement(By.id("002"));
		Textbox2.sendKeys("Quality Thought");
		Thread.sleep(2000);
		
		//Switch to Default 
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//Switch to Frame-3
		driver.switchTo().frame(2);
		Thread.sleep(2000);
				
		//Enter Text in Frame3 TextBox
		WebElement Textbox3=driver.findElement(By.id("003"));
		Textbox3.sendKeys("Selenium");
		Thread.sleep(2000);
		
		//Switch to Default 
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
				
		//Switch to Frame-4
		driver.switchTo().frame(3);
		Thread.sleep(2000);
						
		//Enter Text in Frame4 TextBox
		WebElement Textbox4=driver.findElement(By.id("004"));
		Textbox4.sendKeys("ThankYou");
		Thread.sleep(2000);
		
		//Switch to Default 
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();	
	}

}
