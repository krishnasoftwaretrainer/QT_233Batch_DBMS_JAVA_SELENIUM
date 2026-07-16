package workingWithWindows_Tabs;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle_s {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);

				// FaceBook in NewTab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);

			driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demoblaze.com/index.html");
		Thread.sleep(2000);
		
		Set<String> allwindowids = driver.getWindowHandles();
		System.out.println("All: " + allwindowids);
	
		Thread.sleep(2000);
		
		driver.quit();

	}

}
