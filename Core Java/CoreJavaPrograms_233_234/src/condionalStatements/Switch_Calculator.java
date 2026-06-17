package condionalStatements;
import java.util.Scanner;

public class Switch_Calculator {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Enter the first number");
	int num1=scan.nextInt();
	System.out.println("Enter the second number");
	int num2=scan.nextInt();
	
	System.out.println("CALCULATOR");
	System.out.println("1.ADDITION");
	System.out.println("2.SUBTRACTION");
	System.out.println("3.MULTIPLICATION");
	System.out.println("4.DIVISION");
	System.out.println("5.MODULUS");
	//break;
	//continue;
	System.out.println("Enter your choice");
	char choice=scan.next().charAt(0);
	
	switch(choice)  //T F:Addition 10
	{
	case '+':
	{
		int sum=num1+num2;
		System.out.println("The sum is "+sum);
		break;
		//continue;
	}
	
	case '-':
	{
		int sub=num1-num2;
		System.out.println("The Subtraction is "+sub);
		break;  //Immediately Exit
	}
	
	case '*':
	{
		int mul=num1*num2;
		System.out.println("The Multiplication is "+mul);
		break;
	}
	
	case '/':
	{
		int div=num1/num2;
		System.out.println("The Division is "+div);
		break;
	}
	
	case '%':
	{
		int mod=num1%num2;
		System.out.println("The Modulus is "+mod);
		break;
	}
	
	default:
	{
		System.out.println("Invalid Choice");
	
	}
	}
	
	
	/*
	System.out.println("Enter your choice");
	String choice=scan.next().toUpperCase();
	System.out.println(choice);
	
	switch(choice)  //T F:Addition 10
	{
	case "ADDITION":
	{
		int sum=num1+num2;
		System.out.println("The sum is "+sum);
		break;
	}
	
	case "SUBTRACTION":
	{
		int sub=num1-num2;
		System.out.println("The Subtraction is "+sub);
		break;  //Immediately Exit
	}
	
	case "MULTIPLICATION":
	{
		int mul=num1*num2;
		System.out.println("The Multiplication is "+mul);
		break;
	}
	
	case "DIVISION":
	{
		int div=num1/num2;
		System.out.println("The Division is "+div);
		break;
	}
	
	case "MODULUS":
	{
		int mod=num1%num2;
		System.out.println("The Modulus is "+mod);
		break;
	}
	
	default:
	{
		System.out.println("Invalid Choice");
	
	}
	}
	*/
	
	/*
	System.out.println("Enter your choice");
	int choice=scan.nextInt();
	
	switch(choice)  //T F:Addition 10
	{
	case 1:
	{
		int sum=num1+num2;
		System.out.println("The sum is "+sum);
		break;
	}
	
	case 2:
	{
		int sub=num1-num2;
		System.out.println("The Subtraction is "+sub);
		break;  //Immediately Exit
	}
	
	case 3:
	{
		int mul=num1*num2;
		System.out.println("The Multiplication is "+mul);
		break;
	}
	
	case 4:
	{
		int div=num1/num2;
		System.out.println("The Division is "+div);
		break;
	}
	
	
	case 5:
	{
		int mod=num1%num2;
		System.out.println("The Modulus is "+mod);
		break;
	}
	
	default:
	{
		System.out.println("Invalid Choice");
}
	
	} */
	
	}
	}
	

