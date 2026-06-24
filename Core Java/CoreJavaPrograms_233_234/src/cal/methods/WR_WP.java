package cal.methods;

public class WR_WP 
{
	
	public int add(int a,int b)  //Here a,b are integer parameters
	{
		int c=a+b;
		return c;  //Return type is int c
	}
	
	public static void main(String[] args) 
	{
		
		WR_WP wrwp=new WR_WP();
		System.out.println("Addition: "+wrwp.add(1, 2)); //3
		System.out.println("Addition: "+wrwp.add(10, 20)); //30
		System.out.println("Addition: "+wrwp.add(100, 200)); //300
		System.out.println("Addition: "+wrwp.add(1000, 2000)); //3000
		
		//int sum=wrwp.add(1, 2); //3
		//System.out.println("Addition: "+sum);
		
	}

}
