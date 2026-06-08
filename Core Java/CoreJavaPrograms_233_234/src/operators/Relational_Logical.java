package operators;

public class Relational_Logical {

	public static void main(String[] args) {

		int a=20,b=10;
		int x=30,y=40;
		
		System.out.println(a<b && x>y);  //false && false:false
		System.out.println(a>=b || x<=y); //true || true:true
		
		System.out.println(a==b && a!=b); //false && true:False 
		System.out.println(a==b && a!=b); //false || true:true
		
		System.out.println(5>3 && 6>2);
	}

}
