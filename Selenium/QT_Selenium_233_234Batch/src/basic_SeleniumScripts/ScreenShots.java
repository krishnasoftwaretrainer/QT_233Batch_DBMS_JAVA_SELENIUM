package basic_SeleniumScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// driver.get("https://www.saucedemo.com/");

		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		// ScreenShot-1
		File sc1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc1, new File("D:\\QT\\QT_233_234 Selenium\\ScreenShots\\1.saucedemo.png"));

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);

		// ScreenShot-2
		File sc2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc2, new File("D:\\QT\\QT_233_234 Selenium\\ScreenShots\\2.facebook.png"));

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);

		// ScreenShot-3
		File sc3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc3, new File("D:\\QT\\QT_233_234 Selenium\\ScreenShots\\3.amazon.png"));

		// Backward One Step
		driver.navigate().back();
		Thread.sleep(2000);

		// ScreenShot-4
		File sc4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc4, new File("D:\\QT\\QT_233_234 Selenium\\ScreenShots\\4.backfacebook.png"));

		// Backward Two Steps
		driver.navigate().back();
		Thread.sleep(2000);

		// ScreenShot-5
		File sc5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc5, new File("D:\\QT\\QT_233_234 Selenium\\ScreenShots\\5.backsaucedemo.png"));

		// Forward One Step
		driver.navigate().forward();
		Thread.sleep(2000);

		// ScreenShot-6
		File sc6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc6, new File("D:\\QT\\QT_233_234 Selenium\\ScreenShots\\6.forwardfacebook.png"));

		// Forward Two Steps
		driver.navigate().forward(); // Amazon
		Thread.sleep(2000);

		// ScreenShot-7
		File sc7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc7, new File("D:\\QT\\QT_233_234 Selenium\\ScreenShots\\7.forwardamazon.png"));

		// ReFesh the Page
		driver.navigate().refresh();
		Thread.sleep(2000);

		// ScreenShot-8
		File sc8 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc8, new File("D:\\QT\\QT_233_234 Selenium\\ScreenShots\\8.refreshamazon.png"));
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("ScreenShots Captured Successfully");

	}

}
