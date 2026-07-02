package code_interface;

interface Parent1
{
	public void Father1();
}
interface Parent2
{
	public void Father2();
}

interface Parent3
{
	public void Father3();
}

public class Child implements Parent1,Parent2,Parent3
{
	public void Father1()
	{
		System.out.println("I am your Father1");
	}
	
	public void Father2()
	{
		System.out.println("I am your Father2");
	}
	
	public void Father3()
	{
		System.out.println("I am your Father3");
	}

	public static void main(String[] args) 
	{
		Child ch = new Child();
		//Parent1 ch = new Child();
		ch.Father1();
		
		Parent2 ch1 = new Child();
		ch1.Father2();
		
		Parent3 ch2 = new Child();
		ch2.Father3();
	}
}
