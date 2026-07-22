package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.browserstack.com/");
		Thread.sleep(2000);
		
		/*Click on Live Link in WebTesting 
		 * Step1:Mousehover the Products
		 * Step2:Mousehover the WebTesting
		 * Step3:Click on Live Link in WebTesting 
		 */
		Actions  action = new Actions(driver);
		
		//WebElement for Products Link
		WebElement products=driver.findElement(By.id("products-dd-toggle"));
		//products.click();
		
		action.moveToElement(products).perform();
		Thread.sleep(2000);
		
		WebElement webTesting=driver.findElement(By.id("products-dd-tab-2"));
		action.moveToElement(webTesting).perform();
		Thread.sleep(2000);
		
		WebElement Live=driver.findElement(By.xpath("//span[text()=\"Live\"]"));
		//action.click(Live).perform();
		Live.click();
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
		
	}

}
