package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_RightClick
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		WebElement dblclickbtn=driver.findElement(By.id("doubleClickBtn"));
		//dblclickbtn.click();
		action.doubleClick(dblclickbtn).perform();
		Thread.sleep(2000);
		
		WebElement afterdblclicktext=driver.findElement(By.id("doubleClickMessage"));
		System.out.println(afterdblclicktext.getText());

		//RightClick
		WebElement rclickbtn=driver.findElement(By.id("rightClickBtn"));
		//dblclickbtn.click();
		//action.contextClick().perform();
		action.contextClick(rclickbtn).perform();
		Thread.sleep(2000);
		
		WebElement afterrclicktext=driver.findElement(By.id("rightClickMessage"));
		System.out.println(afterrclicktext.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
