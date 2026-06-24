package cal.methods;

public class WOR_WP 
{
	//Without Return type[void] and With Parameter[Non-empty parenthesis]
	
	public static void add(int a,int b)  //Here a,b are integer parameters
	{
		int c=a+b;
		System.out.println("Addition: "+c); //Here a,b are Dynamic values
	
	}
	
	public static void main(String[] args) 
	{
		WOR_WP.add(1, 2); //3
		WOR_WP.add(10, 20); //30
		WOR_WP.add(100, 200); //300
		WOR_WP.add(1000, 2000); //3000
		
	}
	

}
