package java_Tokens;

public class Variable_Types 
{
	
	static int b=20; //Static Global Variable
	int c=30; //Non Static or Instance Global Variable

	public static void main(String[] args) 
	{
		Variable_Types gv=new Variable_Types(); //Object creation for accessing non static global variable
		
		//1. Local Variable: A variable declared inside class and method.
		int a=10; //Local Variable
		System.out.println("Local variable:"+a);
		
		//Global Variable: A variable declared inside class but outside MainMethod
	System.out.println("Static variable:"+Variable_Types.b);
	
	System.out.println("Instance variable:"+gv.c);
	
	//4.Final Variable: A variable declared with final keyword, value cannot be changed.
	
	//final int d=40;  //Normal variable
	//d=50;
	//d=60;
	final float pi=3.14f; //Final or Constant variable
	//pi=4.14f;
	System.out.println("Final variable:"+pi);
	
	}
	

}
