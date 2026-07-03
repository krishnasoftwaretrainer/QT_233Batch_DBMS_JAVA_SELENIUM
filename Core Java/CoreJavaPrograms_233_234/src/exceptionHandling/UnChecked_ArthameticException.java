package exceptionHandling;

public class UnChecked_ArthameticException {

	public static void main(String[] args) 
	
	{
		
		try
		{
			System.out.println("Start of the program");
			System.out.println(21/2);  //Yes No
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
			//System.out.println("Cannot divide by zero"+e);
			System.out.println("Cannot divide by zero"+e.getMessage());
			
		}	
		
		finally
		{
			System.out.println("End of the program");
			System.out.println("Thank you");
		}
	}

}
