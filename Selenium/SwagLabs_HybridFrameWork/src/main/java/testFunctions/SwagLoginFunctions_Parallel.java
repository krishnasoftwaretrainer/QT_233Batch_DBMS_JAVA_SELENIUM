package testFunctions;

import org.testng.Assert;
import org.testng.annotations.*;

import baseclass.BaseClass_Browser;
import baseclass.BaseClass_Browser_Parallel;
import pom.SwagLogin_Locators;
import utitilities.ExcelOperations;

public class SwagLoginFunctions_Parallel extends BaseClass_Browser_Parallel
{
	@DataProvider(name = "loginData", parallel = true)
	public Object[][] getData() throws Exception {

		return ExcelOperations.readExcelData11("./src/test/resources/SwalabsLoginTestData.xlsx",
				"SWagLoginPageTestData");
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String userName, String password) 
	{
		
		SwagLogin_Locators lp = new SwagLogin_Locators(getDriver());
		lp.SwagLogin(userName, password);
		
		 String currentURL = getDriver().getCurrentUrl();

		if (currentURL.contains("inventory")) {

			Assert.assertTrue(true, "Login successful");

		} else {

			Assert.assertTrue(lp.isErrorDisplayed(),
					"Error message should appear for invalid login");
		}
		System.out.println("Thread ID: " + Thread.currentThread().getId());
	}

}
