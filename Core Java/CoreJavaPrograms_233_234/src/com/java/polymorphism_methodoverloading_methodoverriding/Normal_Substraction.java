package com.java.polymorphism_methodoverloading_methodoverriding;

import java.util.Scanner;

public class Normal_Substraction
{  //Class Opening
	
	int a;  //Global variable
	
	public void substraction(int a,int b) //Method
	{
		int sub=a-b;
		System.out.println("Substraction:"+sub);
	}
	
	public static void main(String[] args)  //Main Method
	{
	Scanner sc=new Scanner(System.in);
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("Substraction:"+sub);
	}

}  //Class Closing
