package basic_SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_MultipleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		WebElement checkbox1=driver.findElement(By.id("checkbox1"));
		checkbox1.click();  
		System.out.println("Outside Checkbox0 Clicked");
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		Thread.sleep(2000);
		
		for(int i=0;i<checkbox.size();i++)
		{
			if(!checkbox.get(i).isSelected() && checkbox.get(i).isDisplayed() && checkbox.get(i).isEnabled())
			{
				checkbox.get(i).click();
				System.out.println("Inside Checkbox "+i+" Clicked");
				Thread.sleep(2000);
		}
		}
		
	}

}
