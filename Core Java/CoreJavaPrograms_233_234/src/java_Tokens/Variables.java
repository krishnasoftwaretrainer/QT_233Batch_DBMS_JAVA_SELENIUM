package java_Tokens;
import java.util.Scanner;
public class Variables {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=10;  //4 bytes variable declaration and initialization
		int b=scan.nextInt(); //Varible Declaration only, value will be assigned by user at runtime
		
		int c=a+b;  //The local variable a may not have been initialized
	
		System.out.println("The sum of a and b is: "+c);}

	
}
