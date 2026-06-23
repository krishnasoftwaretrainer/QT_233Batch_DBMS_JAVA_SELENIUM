package methods;

public class Calculator1 
{

	//Method-1 Addition
	//AccessSpecifier ReturnType MethodName(Parameters_List)

	public void addition()  //Function //Guest1 Guest2
	{						//Non-Static Method:In method signature no static keyword is used
							
		//Logic/Body for Addition
		int a=20;
		int b=10;
		int sum=a+b;  //30
		System.out.println("Addition:"+sum);
		
	}
	
	//Method-2 Subtraction
	public static void subtraction()  //Static Method:In method signature static keyword is used
	{
		int a=20;
		int b=10;
		int sub=a-b;  //10
		System.out.println("Subtraction: "+sub);		
	}
	
	public static void main(String[] args) 
	{  //Bday Function
		//ClassName ObjectName = new ClassName();
		
		Calculator1 cal1= new Calculator1();  //Object Creation
		cal1.addition();  //Method Calling
		Calculator1.subtraction();  //Method Calling
		
	}
	
}
