package basic_SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFile_SendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-07-16 163514.png");
	}

}
