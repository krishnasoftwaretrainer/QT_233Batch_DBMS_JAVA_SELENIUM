package loopingStatements;

import java.util.Scanner;

public class ForLoop_BloodDonation 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=5;i++)  //Fixed Execution
		{
		System.out.println("Enter your Age Here:");
		int age = scan.nextInt();

		if (age >= 18 && age<=55) // Outer T T F 25 15
		{
			System.out.println("Enter your Weight:");
			int weight = scan.nextInt();

			if (weight >= 40 && weight<=80) // Inner T F 35
			{
				System.out.println("You are elgible to donate Blood");// TBS
			} 
			else // Inner else
			{
				System.out.println("You are not Eligible to donate Blood");
				System.out.println("Your Weight is <40 or >80");
			}
		} 
		else // Outer
		{
			System.out.println("You are not Eligible to donate Blood");
			System.out.println("Your age is <18 or age>55");

		}
		System.out.println(i +" Time");

	}
		
	}
}


