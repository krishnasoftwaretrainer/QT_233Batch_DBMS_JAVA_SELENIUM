package workingWithWindows_Tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Tabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Tab-1
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);

		String parentwindowid = driver.getWindowHandle();
		System.out.println("Parent: " + parentwindowid);
		Thread.sleep(2000);

		//Tab-2
		// FaceBook in NewTab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);

		String Child1id = driver.getWindowHandle();
		System.out.println("Child1: " + Child1id);
		Thread.sleep(2000);
		
		//Tab-3
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);

		String Child2id = driver.getWindowHandle();
		System.out.println("Child2: " + Child2id);
		Thread.sleep(3000);
		
		//SwitchTo Tab-1
		driver.switchTo().window(parentwindowid);
		Thread.sleep(3000);
		
		//SwitchTo-3
		if(!parentwindowid.equals(Child1id))
		{
		driver.switchTo().window(Child1id);
		Thread.sleep(3000);
		}
		
		//SwitchTo-2
		if(!parentwindowid.equals(Child2id))
		{
		driver.switchTo().window(Child2id);
		}
	}

}
