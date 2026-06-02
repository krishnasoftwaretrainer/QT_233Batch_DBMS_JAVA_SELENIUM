package datatypes_variables;

public class StudentInfo_Static 
{

	public static void main(String[] args)
	{
	
		byte age=25;
		short rollNo=12345;
		int mobileNo=1234567890;
		long aadharNo=123456789012L;
		
		float percentage=75.5f;
		double cgpa=8.75;
		
		char gender='M';
		boolean isPassed=true;
		
		String name="Krishna Rao";
		
		System.out.println("Student Information:");
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Age: " + age);
		System.out.println("Gender" +gender);
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Aadhar No: " + aadharNo);
		
		System.out.println("Percentage: " + percentage);
		System.out.println("CGPA: " + cgpa);
		System.out.println("Passed: " + isPassed);
		
		
	}

}
