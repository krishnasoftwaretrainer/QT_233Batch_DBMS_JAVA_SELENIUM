package condionalStatements;

import java.util.Scanner;

public class Even_OddNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number");
		int num = scan.nextInt();
			
		/*
			if(num%2==0)
			{
				System.out.println(num+" is Even number");
			}
			else
			{
				System.out.println(num+" is Odd number");
				
			}  */
		
		if(num%2==1)  //0
		{
			System.out.println(num+" is Odd number");
		}
		else
		{
			System.out.println(num+" is Even number");
			
		}
	}

}
