package com.java.polymorphism_methodoverloading_methodoverriding;

public class MOR_Test 
{

	public static void main(String[] args) 
	{
		//Child-1
		SBI sb=new SBI();
		sb.LoneRateOfInterest();
		
		//Child-2
		HDFC hd=new HDFC();
		hd.LoneRateOfInterest();
		
		//Child-3
		ICICI ic=new ICICI();
		ic.LoneRateOfInterest();

	}

}
