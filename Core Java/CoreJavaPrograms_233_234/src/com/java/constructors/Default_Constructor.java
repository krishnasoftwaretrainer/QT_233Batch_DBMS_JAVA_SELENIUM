package com.java.constructors;

public class Default_Constructor  //Class  
{
	int htno=121;
	String name;
	double percentage=99.99;
	
	//public Default_Constructor()
	
	{
		System.out.println("Student Details");
		System.out.println("Name: "+name);
		System.out.println("HTNO: "+htno);
		System.out.println("Percentage: "+percentage);
		System.out.println("==================");
	
	}
	
	public static void main(String[] args) 
	{
		Default_Constructor def = new Default_Constructor();
		
	}
}
