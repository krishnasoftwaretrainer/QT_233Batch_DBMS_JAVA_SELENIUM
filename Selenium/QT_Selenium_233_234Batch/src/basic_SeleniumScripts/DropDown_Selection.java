package basic_SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Selection {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		// Scroll to specific element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Year = driver.findElement(By.id("yearbox"));
		js.executeScript("arguments[0].scrollIntoView(true);", Year);
		Thread.sleep(2000);
		
		// Select DOB
		//Year.sendKeys("1947");  //Don't use sendKeys for dropdown selection
		
		Select selectyear=new Select(Year);
		//1. Select by Index
		selectyear.selectByIndex(10);
		Thread.sleep(2000);
		
		//2. Select by Value
		WebElement month=driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		Select selectmonth=new Select(month);
		selectmonth.selectByValue("September");
		Thread.sleep(2000);
		
		//3. Select by Visible Text
		WebElement day=driver.findElement(By.id("daybox"));
		Select selectday=new Select(day);
		selectday.selectByVisibleText("30");
		Thread.sleep(2000);
		
		//Click on Refresh button
		WebElement refreshbtn=driver.findElement(By.id("Button1"));
		js.executeScript("arguments[0].scrollIntoView(true);", refreshbtn);
		refreshbtn.click();
		
	}

}
