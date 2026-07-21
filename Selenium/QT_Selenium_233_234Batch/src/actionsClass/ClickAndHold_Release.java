package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_Release {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		action.clickAndHold(drag).perform();
		
		Thread.sleep(8000);
		
		action.release(drag).perform();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
