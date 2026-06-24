package cal.methods;

public class WOR_WOP 
{
	
	//Without Return type[void] and Without Parameter[Empty parenthesis]
	
	public void add()
	{
		int a=8,b=10,c;  //Here a,b,c are integer variables
		 c=a+b;
		System.out.println("Addition: "+c);
		
		//Here 8,10 is Static values
	}
	
	public static void main(String[] args) {
		
		WOR_WOP obj=new WOR_WOP();
		obj.add(); //18
		obj.add();
		obj.add();
	}

}
