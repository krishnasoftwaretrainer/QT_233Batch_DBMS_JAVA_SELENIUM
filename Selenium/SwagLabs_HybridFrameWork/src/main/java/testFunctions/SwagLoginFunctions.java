package testFunctions;

import org.testng.Assert;
import org.testng.annotations.*;

import baseclass.BaseClass_Browser;
import pom.SwagLogin_Locators;
import utitilities.ExcelOperations;

public class SwagLoginFunctions extends BaseClass_Browser
{
	@DataProvider(name = "loginData")
	public Object[][] getData() throws Exception {

		return ExcelOperations.readExcelData11("./src/test/resources/SwalabsLoginTestData.xlsx",
				"SWagLoginPageTestData");
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String userName, String password) 
	{
		
		SwagLogin_Locators lp = new SwagLogin_Locators(driver);
		lp.SwagLogin(userName, password);
		
		String currentURL = driver.getCurrentUrl();

		if (currentURL.contains("inventory")) {

			Assert.assertTrue(true, "Login successful");

		} else {

			Assert.assertTrue(lp.isErrorDisplayed(),
					"Error message should appear for invalid login");
		}
	}

}
