package operators;

import java.util.Scanner;

public class Relational_Operators {

	public static void main(String[] args) {
		//int a=20,b=20;     //=:Assignment Operator 
		//float a=20.5f,b=20.3f;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Two Values");
		//byte a=scan.nextByte();
		//byte b=scan.nextByte();
		
		int a=scan.nextInt();
		//float b=scan.nextFloat();
		char b=scan.next().charAt(0);
		//String b=scan.next();
		//boolean b=scan.nextBoolean();
		
		//5>5.5 
		System.out.println(a<b);  //false false 
		System.out.println(a<=b); //false true 
		System.out.println(a>b);  //true  false 
		System.out.println(a>=b); //true  true 
		System.out.println(a==b); //false true               //Comparison Operator
		System.out.println(a!=b); //true  false 
		
		//5>8 or 5==8:false or false:false
		//<or==
	}

}
