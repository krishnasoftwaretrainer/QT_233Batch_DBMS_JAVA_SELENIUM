package inheritance;

public class ML_TestClass {

	public static void main(String[] args) 
	{
	
		ML_Child child=new ML_Child();
		child.Father();      //Father:Cycle 
		child.FatherChild(); //Me:Bike 
		child.Child();       //Son:Car 
	}

}
