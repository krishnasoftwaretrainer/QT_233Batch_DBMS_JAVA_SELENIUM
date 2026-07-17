package basic_SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		// CRUD:Create Insert Select Update Delete
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/webtables");
		driver.navigate().to("https://demoqa.com/webtables");
		Thread.sleep(2000);
		
		//Insert New Record/Row or Employee
		driver.findElement(By.id("addNewRecordButton")).click();
		//WebElement AddBtn=driver.findElement(By.id("addNewRecordButton"));
		//AddBtn.click();
		Thread.sleep(2000);
		
		//1.Enter FirstName
		WebElement firstName=driver.findElement(By.id("firstName"));
		firstName.sendKeys("Krishna");
		Thread.sleep(1000);
		
		WebElement lastName=driver.findElement(By.id("lastName"));
		lastName.sendKeys("N");
		Thread.sleep(1000);
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("Krishna@gmail.com");
		Thread.sleep(1000);
		
		WebElement age=driver.findElement(By.xpath("//input[@placeholder=\"Age\"]"));
		age.sendKeys("25");
		Thread.sleep(1000);
		
		WebElement salary=driver.findElement(By.id("salary"));
		salary.sendKeys("50000");
		Thread.sleep(1000);
		
		WebElement department=driver.findElement(By.id("department"));
		department.sendKeys("QA");
		Thread.sleep(1000);
		
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(2000);
		
		//Select/Retrive/Search
		WebElement searchBox=driver.findElement(By.id("searchBox"));
		searchBox.sendKeys("Krishna");
		Thread.sleep(1000);
		
		WebElement edit=driver.findElement(By.id("edit-record-4"));
		edit.click();
		Thread.sleep(1000);
		
		WebElement lastNameupdate=driver.findElement(By.id("lastName"));
		lastNameupdate.clear();
		Thread.sleep(1000);
		
		lastNameupdate.sendKeys("Rao");
		Thread.sleep(1000);
		
		WebElement submitupdate=driver.findElement(By.id("submit"));
		submitupdate.click();
		Thread.sleep(2000);
		
		//Delete Krishna Record
		WebElement deletebtn=driver.findElement(By.id("delete-record-4"));
		deletebtn.click();
		Thread.sleep(2000);
		
		//Refresh WebPage
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//driver.close();
		driver.quit();
			
		
		/*
		firstName.sendKeys("Krishna");
		Thread.sleep(1000);
		lastName.sendKeys("N");
		Thread.sleep(1000);
		email.sendKeys("Krishna@gmail.com");
		Thread.sleep(1000);
		age.sendKeys("25");
		Thread.sleep(1000);
		salary.sendKeys("50000");
		Thread.sleep(1000);
		department.sendKeys("QA");
		Thread.sleep(1000);
		submit.click();
		*/
		
	}

}
