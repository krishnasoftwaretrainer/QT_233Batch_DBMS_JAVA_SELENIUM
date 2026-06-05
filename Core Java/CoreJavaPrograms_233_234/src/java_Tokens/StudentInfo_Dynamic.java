package java_Tokens;
import java.util.Scanner;

public class StudentInfo_Dynamic {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String name = scan.nextLine();
		//String name = scan.next();
		
		System.out.println("Enter Roll No: ");
		short rollNo = scan.nextShort();
		
		System.out.println("Enter Age: ");
		byte age = scan.nextByte();
		
		System.out.println("Enter HTNO: ");
		int htNo = scan.nextInt();
		
		System.out.println("Enter Mobile No: ");
		long mobileNo = scan.nextLong();
		
		System.out.println("Enter Percentage: ");
		float percentage = scan.nextFloat();
		
		System.out.println("Enter CGPA: ");
		double cgpa = scan.nextDouble();
		
		System.out.println("Enter Gender");
		char gender =scan.next().charAt(0);
		
		System.out.println("Is Passed: ");
		boolean isPassed = scan.nextBoolean();
		
		System.out.println("Student Information:");
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Age: " + age);
		System.out.println("Gender:" +gender);
		System.out.println("HTNO: " + htNo);
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Percentage: " + percentage);
		System.out.println("CGPA: " + cgpa);
		System.out.println("Result: " + isPassed);
	}

}
