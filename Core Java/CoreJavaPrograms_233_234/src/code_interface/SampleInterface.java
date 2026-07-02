package code_interface;

interface  animal //Parent Interface Class is always abstract class
{
	void eat(); //Interface method is always abstract method[Hide]
	void sleep(); 
}


public class SampleInterface implements  animal    //Child Normal Java class
{
	
	public void eat()  //Interface method is always abstract method[Hide]
	{
		System.out.println("Dog is eating");
	}
	
	public void sleep()  
	{
		System.out.println("Dog is sleeping");
	}
	
	
}
