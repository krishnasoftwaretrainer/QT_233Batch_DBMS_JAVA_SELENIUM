package exceptionHandling;

public class UnChecked_ArrayIndexOutOfBoundException {

	public static void main(String[] args) 
	{
		
		try
		{
		int a[]= {10,20,30,40};
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
			System.out.println(e.getMessage());
		}
		
		

	}

}
