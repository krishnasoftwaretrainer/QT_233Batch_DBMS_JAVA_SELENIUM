package java_Tokens;  //Package

import cal.methods.*;

public class Calculator3  //Class
{
	//Accounts Section Billing Counter:+ - * / %
	//Calculator1:+ - *
	//Calculator2: /
	//Calculator3: %
	
	public static void modulus()  //Static Method
	{
		int a=20;
		int b=10;
		int mod=a%b;  //0
		System.out.println("Modulus: "+mod);		
	}
	public static void main(String[] args) {
		Calculator1 cal1= new Calculator1();  //Object Creation
		cal1.addition(); 
		//Different Package and Different Class
		Calculator1.subtraction();
		cal1.multiplication();
		
		Calculator2 cal2= new Calculator2(); 
		cal2.division();
		
		Calculator3.modulus();
		
	
	}
}
