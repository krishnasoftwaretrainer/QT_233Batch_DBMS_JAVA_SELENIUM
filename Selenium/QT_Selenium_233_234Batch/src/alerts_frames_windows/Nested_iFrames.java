package alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		//Switch to Single Frame
		//FrameIndex , FrameID or Name , Frame WebElement
		
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		
		//Single Frame TextBox
		WebElement singleFrameTextBox=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		singleFrameTextBox.sendKeys("Single Frame");
		Thread.sleep(2000);
		
		//Switch to Default 
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
				
		//Click on Iframe with in an Iframe Button
		WebElement IframewithIframebtn=driver.findElement(By.partialLinkText("Iframe with in an Iframe"));
		IframewithIframebtn.click();
		Thread.sleep(2000);
		
		//Switch to Inner Frame-1
		WebElement iframe1=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(iframe1);		
		Thread.sleep(2000);
		
		//Switch to Inner Frame-2
		WebElement iframe2=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(iframe2);
		Thread.sleep(2000);
		
		//Enter Text in Inner Frame TextBox
		WebElement NestedFrameTextBox=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		NestedFrameTextBox.sendKeys("Netsed Frames");
		Thread.sleep(2000);
		
		//Switch to Default 
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();
	}

}
