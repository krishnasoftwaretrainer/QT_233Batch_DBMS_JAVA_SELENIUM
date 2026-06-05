package java_Tokens;

public class TypeConversition 
{

	public static void main(String[] args) 
	{
	//Implicit or Automatic or Widening Type Conversition
	//byte-short-char-int-long-float-double
		
		//10-byte int-10
		
		//byte a=120;  //Low to high[No data loss]
		//int b=a;
		
		//int a=120;
		//float b=a;
		
		//float a=123.12345567f;
		//double b=a;
		
		//char a='d';
		//int b=a;  //65
		//float b=a;
		//System.out.println("a:"+a);
		//System.out.println("b:"+b);
		
		
		//Explicit/Manual/Narrowing
		//double-float-long-int-char-short-byte
		//Type mismatch: cannot convert from float to int
		//Manul:Syntax:(datatype)varibalename->data loss
		
		//float x=12.35f;
		//int y=(int)x;
		
		//int x=100;
		float x=100.85f;
		char y=(char)x;
		
		System.out.println("x:"+x);  //12.35  100
		System.out.println("y:"+y); //12     d
				
	
	
	
	}

}
