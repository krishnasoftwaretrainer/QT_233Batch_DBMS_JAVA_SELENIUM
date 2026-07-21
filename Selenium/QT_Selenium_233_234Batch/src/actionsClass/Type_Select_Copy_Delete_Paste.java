package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Type_Select_Copy_Delete_Paste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//Scroll Top to Down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(00,500)","");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		
		//Enter some Text in TextArea
		WebElement textarea1=driver.findElement(By.id("ta1"));
		WebElement textarea2=driver.findElement(By.xpath("//textarea[@cols=\"30\"]"));
		
		//textarea1.sendKeys("Quality Thought,\nAmeerpet,\nHyderabad");
		
		action.keyDown(textarea1, Keys.SHIFT).sendKeys("Quality Thought \nAmeerpet \nHyderabad \n").keyUp(textarea1, Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		
		//Select All Text in TextArea-1
		action.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//Copy All Selected Text
		action.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//textarea2.clear();
		action.keyDown(textarea2, Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//Delete Selected Text
		action.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);
		
		//Paste Copied Text in TextArea-2
		action.keyDown(textarea2, Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
