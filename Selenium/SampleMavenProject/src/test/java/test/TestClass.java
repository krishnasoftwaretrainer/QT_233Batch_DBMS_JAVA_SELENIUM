package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.POM_By;
import pom.POM_findBy;
import pom.ReadExcelData;

public class TestClass extends BaseClass
{
	@DataProvider(name = "loginData")
	public Object[][] getData() throws Exception {

		return ReadExcelData.readExcelData11(
                "D:\\QT\\QT_233_234 Selenium\\SwalabsLoginTestData.xlsx",
                "SWagLoginPageTestData"
        );
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String userName, String password) throws InterruptedException {

		//POM_By lp = new POM_By(driver);
		
		POM_findBy lp = new POM_findBy(driver);
		lp.SwagLogin(userName, password);
		Thread.sleep(2000);
		String currentURL = driver.getCurrentUrl();

		if (currentURL.contains("inventory")) {

			Assert.assertTrue(true, "Login successful");

		} else {

			Assert.assertTrue(lp.isErrorDisplayed(),
					"Error message should appear for invalid login");
		}
	}
		


}
