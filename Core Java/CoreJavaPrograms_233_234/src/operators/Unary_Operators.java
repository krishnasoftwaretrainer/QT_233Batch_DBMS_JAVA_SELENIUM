package operators;

public class Unary_Operators {

	public static void main(String[] args) 
	{
	
		//int k=+10,l=-10;
		//System.out.println(k);
		//System.out.println(l);
		/*
		int a=10,b=10,c=10,d=10;
		
		System.out.println("Actuval a="+a); //a=10
		System.out.println("++a="+(++a)); //a=11
		System.out.println("Updated a="+a); //a=11
		System.out.println("=================");
		
		System.out.println("Actuval b="+b);	//b=10
		System.out.println("b++="+(b++)); //b=10
		System.out.println("Updated b="+b); //b=11
		System.out.println("=================");
		
		System.out.println("Actuval c="+c);	 //c=10	
		System.out.println("--c="+(--c)); //c=9
		System.out.println("Updated c="+c); //c=9
		System.out.println("=================");
		
		System.out.println("Actuval d="+d); //d=10
		System.out.println("d--="+(d--)); //d=10
		System.out.println("Updated d="+d); //d=9
		*/
		
		int x=10;
		
		System.out.println("First X Value:"+x);  //10
		System.out.println("Actuval x="+x); //10
		System.out.println("++x="+(++x)); //11
		System.out.println("Updated x="+x); //11
		System.out.println("=================");
		
		System.out.println("Actuval x="+x);	//x=11
		System.out.println("x++="+(x++)); //Print 11
		System.out.println("Updated x="+x); //Update x=12
		System.out.println("=================");
		
		System.out.println("Actuval x="+x);	 //x=12
		System.out.println("--x="+(--x)); //x=11
		System.out.println("Updated x="+x); //x=11
		System.out.println("=================");
		
		System.out.println("Actuval x="+x); //x=11
		System.out.println("x--="+(x--)); //Print x=11
		System.out.println("Updated x="+x); //x=10
		
		System.out.println("Last X Value:"+x); //x=10
	}

}
