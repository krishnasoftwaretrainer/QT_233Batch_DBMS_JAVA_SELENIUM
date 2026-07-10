package basic_SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_isDisplayed_isEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		// 7.Hobbies:Checkbox:Cricket,Movies,Hockey
		//int a=10;
		
		WebElement checkbox1=driver.findElement(By.id("checkbox1"));
		
		//First time click on checkbox1
		//checkbox1.click();   //Checkbox1 is selected
		Thread.sleep(2000);
		
		//Second time click on checkbox1
		
		if(!checkbox1.isSelected() && checkbox1.isDisplayed() && checkbox1.isEnabled())
		{
		checkbox1.click();  //Second time
		System.out.println("Checkbox1 Clicked");
		}
		
		//Checkbox 2
		WebElement checkbox2=driver.findElement(By.id("checkbox2"));
		//checkbox2.click();
		
		if(!checkbox2.isSelected() && checkbox2.isDisplayed() && checkbox2.isEnabled())
		{
		checkbox2.click();  //Second time
		System.out.println("Checkbox2 Clicked");
		}
		
		//Checkbox 3
		
		WebElement checkbox3=driver.findElement(By.id("checkbox3"));
		//checkbox3.click();
		
		if(!checkbox3.isSelected() && checkbox3.isDisplayed() && checkbox3.isEnabled())
		{
		checkbox3.click();  //Second time
		System.out.println("Checkbox3 Clicked");
		}
		
		
		
		
		
		// Cricket
		/*
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(2000);

		// Movies
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("checkbox3")).click();
		Thread.sleep(2000);
		
	*/
	


	}

}
