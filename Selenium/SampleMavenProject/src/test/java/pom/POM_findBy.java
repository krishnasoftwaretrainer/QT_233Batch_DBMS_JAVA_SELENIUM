package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_findBy 
{
	WebDriver driver;

	public POM_findBy(WebDriver driver) {

	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	// Locators

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginButton;

	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement errorMsg;

	// Method

	public void SwagLogin(String user, String pass) {

		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	public boolean isErrorDisplayed() {

		return errorMsg.isDisplayed();
	}

}
