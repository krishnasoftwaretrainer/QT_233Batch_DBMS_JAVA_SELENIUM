package condionalStatements;
import java.util.Scanner;
public class Eligible_Vote_OrNot {

	public static void main(String[] args) {
		// To check the person is eligible applying for vote or not
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the your age");
		int age=scan.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligible for applying vote");
			System.out.println("Please submit the required documents");
			
		}
		else
		{
			System.out.println("You are not eligible for applying vote");
			System.out.println("Your age is "+age);
			System.out.println("You need to wait for "+(18-age)+" years applying vote");
		}

	}

}
