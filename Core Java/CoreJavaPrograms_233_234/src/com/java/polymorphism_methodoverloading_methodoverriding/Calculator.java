package com.java.polymorphism_methodoverloading_methodoverriding;

public class Calculator 
{
	/*
	public void Addition(int a,int b)  //2
	{
		int sum=a+b;
		System.out.println("Addiiton:"+sum);
	}
	
	public void Addition(int a,int b,int c)   //3
	{
		int sum=a+b+c;
		System.out.println("Addiiton:"+sum);
	}
	
	public void Addition(int a,int b,int c,int d)   //4
	{
		int sum=a+b+c+d;
		System.out.println("Addiiton:"+sum);
	}
*/
	
	public void Addition(double a,double b)  //2
	{
		double sum=a+b;
		System.out.println("Addiiton:"+sum);
	}
	
	public void Addition(double a,double b,double c)   //3
	{
		double sum=a+b+c;
		System.out.println("Addiiton:"+sum);
	}
	
	public void Addition(float a,float b,float c,float d)   //4
	{
		float sum=a+b+c+d;
		System.out.println("Addiiton:"+sum);
	}
	public static void main(String[] args) 
	{
		
		Calculator cal1 = new Calculator();
		cal1.Addition(20.5, 30.6);
		cal1.Addition(52.2, 64.3);
		cal1.Addition(20.2, 30.3, 40.4);
		cal1.Addition(20.1f, 30.2f, 40.3f, 50.4f);
		
	}
}
