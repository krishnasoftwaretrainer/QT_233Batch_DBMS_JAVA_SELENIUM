package strings;

import java.util.Scanner;

public class StringDeclaration {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		// String declaration using string literal
		//data type variable name = "value";
		//String literal is stored in string pool memory
		/*
		String str1 = "Hello World";
		System.out.println(str1);
		String str2 = "Hello World";
		System.out.println(str2);
		
		System.out.println("================================");
		//String declaration using new keyword
		//New keyword is used to create a new object in memory
		//It is Stored in heap memory out of string pool
		
		String str5 = new String("Hello World");
		System.out.println(str5);
		String str6 = new String("Hello World");
		System.out.println(str6);
		*/
		
		//Dynamic String declaration
		System.out.println("Enter the String value:");
		//String str7 = scan.next();
		String str7 = scan.nextLine();
		System.out.println(str7);
	}

}
