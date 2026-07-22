package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_Reg {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/registration/createAccount");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"); // Scroll down by 500 pixels
		Thread.sleep(2000);
		
		//Click on I am Experienced Link
		WebElement iamExp=driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]"));
		iamExp.click();
		Thread.sleep(2000);
		
		//Click on Upload Resume Button
		WebElement uploadResume=driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]"));
		uploadResume.click();
		//uploadResume.sendKeys("C:\\Users\\HP\\Downloads\\clean_invoice.pdf");
		Thread.sleep(2000);
		
		
		//Use AutoIT Script to upload Resume
		Runtime.getRuntime().exec("D:\\QT\\QT_233_234 Selenium\\AutoIT\\NaukariUploadResume.exe");

	}

}
