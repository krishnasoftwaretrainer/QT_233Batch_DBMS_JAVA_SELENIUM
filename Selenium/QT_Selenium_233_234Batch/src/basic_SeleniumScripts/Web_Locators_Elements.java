package basic_SeleniumScripts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Locators_Elements {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//1.First Name:Text Box
		//driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).sendKeys("Krishna");
		//driver.findElement(By.tagName("input")).sendKeys("Krishna");
		
		//Xpath:
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Krishna");
		//Thread.sleep(2000);
		
		//2.Last Name:Text Box:XPath
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Rao");
		//Thread.sleep(2000);
		
		//3.Address:Text Area:XPath
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Quality Thoughts, \nAmeerpet, \nHyderabad, \nIndia, \n 500038");
		//Thread.sleep(2000);
		
		//4.Email Address:Text Box:XPath
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("Krishna123@gmail.com");
		Thread.sleep(2000);
		
		//5.Phone:Text Box:XPath
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		//6.Gender:Radio Button:Male or Female
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		Thread.sleep(3000);

		//7.Hobbies:Checkbox:Cricket,Movies,Hockey
		//Cricket
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(2000);
		
		//Movies
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(2000);
		
		//Hockey
		driver.findElement(By.id("checkbox3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox3")).click();
		
	}

}
