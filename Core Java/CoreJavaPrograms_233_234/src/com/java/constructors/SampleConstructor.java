package com.java.constructors;

public class SampleConstructor   //Class 
{
	int a;  //Global or Instance Variable
	String name;
	
	public SampleConstructor()  //Constructor
	{
		System.out.println("Sample Constructor");
		
		System.out.println(a);
		System.out.println(name);
	}
	
	public void SampleMethod1()  //Method-1
	{
		System.out.println("Sample Method-1");
	}
	
	public static void SampleMethod2()  //Method-2
	{
		System.out.println("Sample Method-2");
	}
	
	public static void main(String[] args) 
	{
		//ClassName ObjName=new ConstructorName() ;
		SampleConstructor cons = new SampleConstructor();
		cons.SampleMethod1();
		SampleConstructor.SampleMethod2();
		
	}
	

}
