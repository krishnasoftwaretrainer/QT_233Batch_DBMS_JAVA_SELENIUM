package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exceptions {

	public static void main(String[] args) 
	{
		/*
		System.out.println("Start of the program");
		Thread.sleep(2000);  //Wait Checked Exception
		
		System.out.println("Program Excution");
		Thread.sleep(2000);  //Wait Checked Exception
		
		System.out.println("End of the program");
		Thread.sleep(2000);  //Wait Checked Exception
		
		System.out.println("Thank you");

		//Unhandled exception type InterruptedException
		//java.lang.Error: Unresolved compilation problem: 
		//Unhandled exception type FileNotFoundException
		
		//Second Compile Time Exception 
		FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\Java.txt");  //Checked Exception
		*/
		
		System.out.println("Start of the program");
		
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e);
		}  //Wait Checked Exception
		
		finally
		{
			System.out.println("Thankyou");
		}
	}

}
