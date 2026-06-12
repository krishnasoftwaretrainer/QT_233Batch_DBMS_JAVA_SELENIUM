package condionalStatements;
import java.util.Scanner;
public class FindGender {

	public static void main(String[] args) 
	{
		// Male or Female
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Gender"); //Male Female RamaRao
		String gender=scan.next();
		
		//if(gender.equals("Male"))
		if(gender.equalsIgnoreCase("Male"))
		{
			System.out.println("Your gender is Male");
		}
		else if(gender.equalsIgnoreCase("Female"))
		{
			System.out.println("Your gender is Female");
		}
		
		else if(gender.equalsIgnoreCase("Trans"))
		{
			System.out.println("Your gender is Transgender");
		}
		
		else
		{
			System.out.println("Gender must be:Male or Female");
		}
	}

}
