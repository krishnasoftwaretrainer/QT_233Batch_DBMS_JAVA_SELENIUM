package com.java.polymorphism_methodoverloading_methodoverriding;

public class MOL_DifferentDataTypes 
{
	public void Addition(int a,int b)  //int,String
	{
		int sum=a+b;
		System.out.println("Addiiton:"+sum);
		System.out.println("================");
	}

	public void Addition(double a,double b)  //int,String
	{
		double sum=a+b;
		System.out.println("Addiiton:"+sum);
		System.out.println("================");
	}
	
	public static void main(String[] args) 
	{
		
		MOL_DifferentDataTypes cal1 = new MOL_DifferentDataTypes();
		cal1.Addition(20, 30);
		cal1.Addition(20.5, 30.6);
		
	}
}
