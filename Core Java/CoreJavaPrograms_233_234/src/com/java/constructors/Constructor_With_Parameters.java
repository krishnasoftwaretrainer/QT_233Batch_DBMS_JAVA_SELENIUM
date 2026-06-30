package com.java.constructors;

public class Constructor_With_Parameters 
{
	public Constructor_With_Parameters(String name,int htno,double fee)
	{
		//Parameterized Constructor
		System.out.println("Student Details");
		System.out.println("Name: "+name);
		System.out.println("HTNO: "+htno);
		System.out.println("Fee: "+fee);
		System.out.println("==================");
	}
	
	public static void main(String[] args) 
	{
		Constructor_With_Parameters wip1;
		
		wip1= new Constructor_With_Parameters("Krishna",121,99.99);
		
		wip1 = new Constructor_With_Parameters("Ramesh",122,98.87);
		
		wip1 = new Constructor_With_Parameters("Sunitha",123,100.00);
		
		/*
	Constructor_With_Parameters wip1 = new Constructor_With_Parameters("Krishna",121,99.99);
		
	Constructor_With_Parameters wip2 = new Constructor_With_Parameters("Ramesh",122,98.87);
	
	Constructor_With_Parameters wip3 = new Constructor_With_Parameters("Sunitha",123,100.00);
	*/
	}

}
