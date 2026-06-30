package com.java.polymorphism_methodoverloading_methodoverriding;

public class MOL_OrderOfParameters
{
	public void Addition(int a,double b)  //int,String
	{
		double sum=a+b;
		System.out.println("Addiiton:"+sum);
		System.out.println("================");  //ZPHS:6th:M 7th:M 8th:M 9th 10th 11th 12th
	}

	public void Addition(double a,int b)  //int,String
	{
		double sum=a+b;
		System.out.println("Addiiton:"+sum);
		System.out.println("================");
	}

}
