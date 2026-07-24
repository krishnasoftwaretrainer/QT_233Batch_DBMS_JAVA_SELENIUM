package testNg_Scripts;

import org.testng.annotations.Test;

public class SampleTestNG 
{
	@Test(priority=0)
	public void India()
	{
		System.out.println("I am in India");
	}
	
	@Test(priority=1)
	public void Telengana()
	{
		System.out.println("I am in Telengana");
	}

	@Test(priority=2,invocationCount=3,enabled=false)
	public void Hyderabad()
	{
		System.out.println("I am in Hyderabad");
	}
}
