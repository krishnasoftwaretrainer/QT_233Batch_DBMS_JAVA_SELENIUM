package stepDefinitions;

import org.junit.Assert;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.ExcelUtils;

public class SwagAllLoginTestData {
	LoginPage loginPage;

    String username;
    String password;
    String expectedResult;

    String excelPath = "src/test/resources/testdata/SwagLoginData.xlsx";

    Object[][] excelData;

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        loginPage = new LoginPage(Hooks.driver);
    }

    @When("The user enters username and password from Excel row {string}")
    public void the_user_enters_username_and_password_from_excel(String row)
            throws Exception 
    {

        excelData = ExcelUtils.readExcelData11(
                excelPath,
                "SWagLoginPageTestData");

        int rowNumber = Integer.valueOf(row) - 1;

        username = excelData[rowNumber][0].toString();
        password = excelData[rowNumber][1].toString();
        expectedResult = excelData[rowNumber][2].toString();

        System.out.println("=================================");
        System.out.println("Excel Row: " + row);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("=================================");
        Thread.sleep(2000);
        loginPage.enterUsername(username);
        Thread.sleep(2000);
        loginPage.enterPassword(password);
        Thread.sleep(2000);
    }

    @And("The user clicks the swag login button")
    public void the_user_clicks_the_swag_login_button() throws InterruptedException {

        loginPage.clickLogin();
        Thread.sleep(2000);
    }

    @Then("The login result should be validated")
    public void the_login_result_should_be_validated() {

        if (expectedResult.equalsIgnoreCase("Successful Login")) {

            Assert.assertTrue(
                    "Login should be successful",
                    loginPage.isLoginSuccessful());

        } else if (expectedResult.equalsIgnoreCase("Error Message")) {

            Assert.assertTrue(
                    "Error message should be displayed",
                    loginPage.isErrorDisplayed());

        } else {

            Assert.fail(
                    "Invalid ExpectedResult in Excel: "
                    + expectedResult);
        }
    }
}
