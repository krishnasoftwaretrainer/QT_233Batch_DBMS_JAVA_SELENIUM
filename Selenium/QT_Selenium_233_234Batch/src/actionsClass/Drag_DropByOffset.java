package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropByOffset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		WebElement drag=driver.findElement(By.id("draggable"));
	
		action.dragAndDropBy(drag, 0, 100).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(drag, 100, 0).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(drag, 0, -100).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(drag, -100, 0).build().perform();
	}

}
