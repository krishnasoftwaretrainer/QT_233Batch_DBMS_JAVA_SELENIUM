package exceptionHandling;

public class WithException {

	public static void main(String[] args) 
	{
		//Without Exception Handling
		//Runtime Exception: ArithmeticException: / by zero
		System.out.println("Start of the program");
		System.out.println("End of the program");
		
		System.out.println(21/0);  //7  break Interpreter
		System.out.println("Thank you");

	}

}
