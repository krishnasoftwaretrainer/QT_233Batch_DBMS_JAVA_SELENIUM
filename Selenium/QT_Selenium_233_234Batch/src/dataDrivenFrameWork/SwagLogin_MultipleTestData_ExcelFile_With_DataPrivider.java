package dataDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SwagLogin_MultipleTestData_ExcelFile_With_DataPrivider extends BaseClass
{

		@DataProvider(name = "SwagLabsLoginTestData")
		public Object[][] SwagLaginData() throws IOException // WR WOP
		{
			return ReadExcelData.readExcelData11(
	                "D:\\QT\\QT_233_234 Selenium\\SwalabsLoginTestData.xlsx",
	                "SWagLoginPageTestData"
	        );
		}

		@Test(dataProvider = "SwagLabsLoginTestData")
		public void SwagLabLoginpage(String UserName, String Password) throws InterruptedException {
		
			
			Thread.sleep(2000);
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

}

