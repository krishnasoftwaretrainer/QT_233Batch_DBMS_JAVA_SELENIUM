package workingWithWindows_Tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);

		String firstwindowid = driver.getWindowHandle();
		System.out.println("First: " + firstwindowid);
		Thread.sleep(2000);

		// FaceBook in NewTab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);

		String secondwindowid = driver.getWindowHandle();
		System.out.println("Second: " + secondwindowid);
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);

		String thirdwindowid = driver.getWindowHandle();
		System.out.println("Third: " + thirdwindowid);
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demoblaze.com/index.html");
		Thread.sleep(2000);
		String fourthwindowid = driver.getWindowHandle();
		System.out.println("Fourth: " + fourthwindowid);
		Thread.sleep(2000);
		
		driver.quit();
	}

}
