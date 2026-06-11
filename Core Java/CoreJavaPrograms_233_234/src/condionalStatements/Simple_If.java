package condionalStatements;
import java.util.Scanner;
public class Simple_If {

	public static void main(String[] args) 
	{
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int ObtainedMarks = scann.nextInt();  
		
		if(ObtainedMarks>=35)  //Logics true/false  85>=35:true 25>=35:false
		{
		System.out.println("Pass");	
		}
	}

}
