package condionalStatements;
import java.util.Scanner;
public class BigNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter age for any 2 persons");
		
		int firstPersonAge = scan.nextInt();
		
		int secondPersonAge = scan.nextInt();
		
		if(firstPersonAge>secondPersonAge)
		{
			System.out.println("First person is elder than second person");
			System.out.println("First person age is "+firstPersonAge);
			System.out.println("Second person age is "+secondPersonAge);
		}
		else
		{
			System.out.println("Second person is elder than first person");
			System.out.println("Second person age is "+secondPersonAge);
			System.out.println("First person age is "+firstPersonAge);
		}
		
	}

}
