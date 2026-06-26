package inheritance;

public class HL_TestClass 
{
	public static void main(String[] args) 
	{
		
		HL_Child1 child1 = new HL_Child1();
		child1.Father();
		child1.Son1();
		System.out.println("==============");
		
		HL_Child2 child2 = new HL_Child2();
		child2.Father();
		child2.Daughter1();
		
		System.out.println("==============");
		
		HL_Child3 child3 = new HL_Child3();
		
		child3.Father();
		child3.Son2();
		
		
	}

}
