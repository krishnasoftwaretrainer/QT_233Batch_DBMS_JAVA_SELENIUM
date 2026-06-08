package operators;

public class Arthametic_Operators {

	public static void main(String[] args) {
		
		int a=10,b=3;  //6 Places 
		
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mdiv=a%b;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mdiv);
		
		int all=sum+sub+mul+div+mdiv;
		System.out.println(all);
		System.out.println("=================");
		
		System.out.println(10+3);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10%3);
		
		
		
		/*
		System.out.println(a+b);  //15  8  -2
		System.out.println(a-b);  //5   -2  8
		System.out.println(a*b);  //50   15 -15
		System.out.println(a/b);  //2    0  0
		System.out.println(a%b);  //0   3  3
		*/
	}

}
