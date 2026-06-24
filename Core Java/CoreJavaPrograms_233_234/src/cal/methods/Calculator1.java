package cal.methods;  //Package

import java.util.Scanner;

public class Calculator1  //Class
{
	//Scanner scan=new Scanner(System.in);  //Scanner Class Object Creation
	//Method-1 Addition
	//AccessSpecifier ReturnType MethodName(Parameters_List)
	//Customer Billing Counter
	
	public void addition()  //Function //Guest1 Guest2
	{					//Non-Static Method:In method signature no static keyword is used
						//Logic/Body for Addition
		int a=20;
		int b=10;
		int sum=a+b;  //30
		System.out.println("Addition:"+sum);
		
	}
	
	//Method-2 Subtraction
	private static void subtraction()  //Static Method:In method signature static keyword is used
	{
		int a=20;
		int b=10;
		int sub=a-b;  //10
		System.out.println("Subtraction: "+sub);		
	}
	
	protected void multiplication()  //Non-Static Method
	{
		int a=20;
		int b=10;
		int mul=a*b;  //200
		System.out.println("Multiplication: "+mul);		
	}
	
	public static void main(String[] args) 
	{  //Bday Function
		//ClassName ObjectName = new ClassName();
		
		Calculator1 cal1= new Calculator1();  //Object Creation
		cal1.addition();  //Method Calling
		//Same Package and Same Class
		//Calculator1.addition();  //Method Calling
		
		Calculator1.subtraction();  //private access specifier
		
		//cal1.subtraction();
		
		cal1.multiplication();
	}
	
}
