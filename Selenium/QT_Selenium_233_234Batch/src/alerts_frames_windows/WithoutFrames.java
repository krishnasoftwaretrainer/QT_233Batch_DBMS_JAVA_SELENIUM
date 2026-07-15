package alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutFrames 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frame_a.html");
		Thread.sleep(2000);
		
		WebElement Textbox1=driver.findElement(By.id("001"));
		Textbox1.sendKeys("Krishna");
		Thread.sleep(2000);
		Textbox1.clear();
		Thread.sleep(2000);
		Textbox1.sendKeys("Quality Thought");
		Thread.sleep(2000);
		System.out.println("Text: "+Textbox1.getAttribute("value"));
	}

}
