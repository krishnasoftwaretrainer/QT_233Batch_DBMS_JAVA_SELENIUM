package alerts_frames_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		/* First Alert:Only OK
		//Click on display an alert box
		WebElement AlertwithOK=driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		System.out.println("Alert with OK Text: "+AlertwithOK.getText());
		AlertwithOK.click();
		Thread.sleep(2000);
		
		String alertboxText=driver.switchTo().alert().getText();
		System.out.println("First Alert Text: "+alertboxText);
		Thread.sleep(2000);
		
		//Accept the alert 
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		*/
		
		//Second Alert:OK or Cancel 
		/* Step1: Click on: Alert with OK & Cancel Button
		 * Step2: Click on click the button to display a confirm box  Button
		 * Step3:Get Alert Text: Press a Button !
		 * Step4:Accept or Dismiss Alert
		 * Step5:Get Text after Accept or Dismiss Alert 
		 */
		
		//WebElement AlertwithOK_CancelButton = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
		//WebElement AlertwithOK_CancelButton = driver.findElement(By.partialLinkText("Alert with OK & Cancel"));
		
		/*
		WebElement AlertwithOK_CancelButton = driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]"));
		AlertwithOK_CancelButton.click();
		Thread.sleep(5000);
		
		WebElement displayConfirmBox=driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]"));
		displayConfirmBox.click();
		Thread.sleep(2000);
		
		String Alert2Text= driver.switchTo().alert().getText();
		System.out.println("Alert2 Test: "+Alert2Text);
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		WebElement afteralertText=driver.findElement(By.id("demo"));
		System.out.println("After Alert2 Text: "+afteralertText.getText());
		*/
		
				//Third Type Alert:OK or Cancel 
				/* Step1: Click on: Alert with TextBox
				 * Step2: Click on "click the button to demonstrate the prompt box"
				 * Step3:Get Alert Text: "Please enter your name"
				 * Step4:Enter any text on alert Text box
				 * Step5:Accept or Dismiss Alert
				 * Step6:Get Text after Accept Alert 
				 */
		
		WebElement AlertwithTextBox=driver.findElement(By.linkText("Alert with Textbox"));
		AlertwithTextBox.click();
		Thread.sleep(5000);
		
		WebElement prmoptBox=driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		prmoptBox.click();
		Thread.sleep(2000);
								
		boolean alertaccept=false;
				
		if(alertaccept)
		{
			String Alert3Text= driver.switchTo().alert().getText();
			System.out.println("Alert3 Test: "+Alert3Text);  //Please enter your name
			Thread.sleep(2000);
			
			driver.switchTo().alert().sendKeys("Quality Thought");
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			
			WebElement afteralertText=driver.findElement(By.id("demo1"));
			System.out.println("After Alert3 Text Entered: "+afteralertText.getText());
			//Hello Krishna How are you today
		}
		else
		{
			driver.switchTo().alert().dismiss();
			Thread.sleep(2000);
			System.out.println("You are Canceled alert");
		}
		
		Thread.sleep(3000);
		driver.close();
				
	}

}
