package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Cinfg {

	public static void main(String[] args) throws InterruptedException {
		//Step1:Open Edge Browser
		 WebDriver driver=new EdgeDriver();
		 Thread.sleep(2000);  //Hold the execution 2s
		  
 		 //Step2:Maximize Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);  //Hold the execution 2s
		
		//Step3:Enter URL 
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);  //Hold the execution 2s
		
		//Step4:Close Browser
		//driver.close();


	}

}
