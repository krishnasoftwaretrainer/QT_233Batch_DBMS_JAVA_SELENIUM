package basic_SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoblaze.com/index.html#");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(3000);
		List<WebElement> allproducts=driver.findElements(By.xpath("//div[@id=\"tbodyid\"]//h4/a"));
		for(int i=0;i<allproducts.size();i++)
		{
		System.out.println(allproducts.get(i).getText());
		}
	}

}
