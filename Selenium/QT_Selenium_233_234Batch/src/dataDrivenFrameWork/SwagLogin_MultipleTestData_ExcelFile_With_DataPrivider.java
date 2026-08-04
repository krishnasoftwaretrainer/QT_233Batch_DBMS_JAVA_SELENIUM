package dataDrivenFrameWork;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SwagLogin_MultipleTestData_ExcelFile_With_DataPrivider {
	public class DataProvider_Swag {
		WebDriver driver;

		@DataProvider(name = "SwagLabsLoginTestData")
		public Object[][] SwagLaginData() // WR WOP
		{
			return new Object[][] { 
				{ "standard_user", "secret_sauce" }, 
				{ "standard_user", "invalid_pwd" },
					{ "invalid_user", "secret_sauce" },
					{ "invalid_user", "invalid_pwd" }, 
					{ "standard_user", "" },
					{ "", "secret_sauce" }, 
					{ "", "" },

			};
		}

		@BeforeMethod
		public void BrowserLaunch() throws InterruptedException {
			driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
		}

		@Test(dataProvider = "SwagLabsLoginTestData")
		public void SwagLabLoginpage(String UserName, String Password) throws InterruptedException {

			WebElement userName = driver.findElement(By.tagName("input"));
			userName.sendKeys(UserName);
			Thread.sleep(2000);

			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys(Password);
			Thread.sleep(2000);

			WebElement loginbtn = driver.findElement(By.id("login-button"));
			loginbtn.click();
			Thread.sleep(2000);

		}

		@AfterMethod
		public void BrowserClose() {
			driver.close();
		}

	}

}
