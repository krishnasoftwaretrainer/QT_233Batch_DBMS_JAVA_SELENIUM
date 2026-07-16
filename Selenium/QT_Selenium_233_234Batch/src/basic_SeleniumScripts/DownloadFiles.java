package basic_SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFiles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
				
		WebElement seleniumdownloadlink=driver.findElement(By.xpath("//a[text()=\"4.46.0\"]"));
		
		//Scroll upto Specific element
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1100)");
		//js.executeScript("arguments[0].scrollIntoView(true)",seleniumdownloadlink);
		Thread.sleep(2000);
		
		seleniumdownloadlink.click();

	}

}
