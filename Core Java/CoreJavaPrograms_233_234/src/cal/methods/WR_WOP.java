package cal.methods;

public class WR_WOP 
{
	//With Return type[Non-void] and Without Parameter[Empty parenthesis]
	
	public int add() 
	{
		int a=20,b=10,c;  //Variables
		c=a+b;
		return c;  //Return type is int c
		
	}
	
	public static void main(String[] args)
	{
		
		WR_WOP wrwop=new WR_WOP();
		System.out.println("Addition: "+wrwop.add());  //18
		System.out.println("Addition: "+wrwop.add());
		
		//int sum=wrwop.add(); //18
		//System.out.println("Addition: "+sum);
	}

}
