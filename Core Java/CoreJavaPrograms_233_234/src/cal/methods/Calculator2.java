package cal.methods;  //Package

public class Calculator2  //Class
{
	//Warehouse Billing Counter purpose Calculator:+ - * /
	
	void division()  //Non-Static Method
	{
		int a=20;
		int b=10;
		int div=a/b;  //2
		System.out.println("Division: "+div);		
	}
	public static void main(String[] args) 
	{
		Calculator1 cal1= new Calculator1();  //Object Creation
		cal1.addition();  //Method Calling
		//Same Package and Different Class
		//Calculator1.subtraction();
		cal1.multiplication();
		
		Calculator2 cal2= new Calculator2();  //Object Creation
		cal2.division();  
		
	}
	

}
