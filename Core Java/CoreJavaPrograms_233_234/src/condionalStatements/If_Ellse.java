package condionalStatements;

import java.util.Scanner;

public class If_Ellse {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int ObtainedMarks = scan.nextInt();  
		
		/*
		if(ObtainedMarks>=35)  //Logics true/false  85>=35:true 25>=35:false
		{
		System.out.println("Pass");	
		}
		else
		{
			System.out.println("Fail");
		}  */
		
		if(ObtainedMarks<35)  //35 343
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
	}

}
