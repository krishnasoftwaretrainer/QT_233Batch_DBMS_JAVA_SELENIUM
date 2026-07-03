package exceptionHandling;

public class UnChecked_NullPointerException {

	public static void main(String[] args) 
	{
		
		//String name="Krishna";
		//String name=null;
		
		//System.out.println(name.length());  
		
		try
		{
			String name=null;
			System.out.println(name.length());
		}
		
		catch(NullPointerException np)
		{
			System.out.println("Exception Handled");
			System.out.println(np.getMessage());
		}
		
		finally
		{
			System.out.println("Thankyou");
		}

	}

}
