package com.java.polymorphism_methodoverloading_methodoverriding;

public class MOL_NumberOfParameters 
{
	public static void Parameters()  //Null 
	{
		System.out.println("No Parameters");
		System.out.println("================");
	}
	
	public static void Parameters(String name)  //One Parameter
	{
		System.out.println("One Parameter:"+name);
		System.out.println("================");
	}
	
	public static void Parameters(String name,String cource)  //Two Parameter
	{
		System.out.println("Two Parameters:"+name);
		System.out.println("Two Parameters:"+cource);
	}
	
	public static void main(String[] args) 
	{
		MOL_NumberOfParameters.Parameters();
		MOL_NumberOfParameters.Parameters("ZPHS");
		MOL_NumberOfParameters.Parameters("ZPHS","Java");
		
	}

}
