package strings;

public class Equal_EqualIgnore_DoubleEqual {

	public static void main(String[] args) 
	{
		/* ==:Compare the reference of two objects
		 * equals():Compare the content of two objects
		 */
		//String Literal Pool
		String str1 = "Hello World";  //First it is Stored in string pool memory
		System.out.println(str1);  //123
		//String str2 = "Hello World"; //It is using reference of str1 and not creating new object in string pool memory
		String str2 = "My World";
		System.out.println(str2);  //123
		String str3 = "Hello World"; 
		System.out.println(str3);  //123
		
		System.out.println(str1 == str2);  //true  false
		System.out.println(str1 == str3);  //true
		
		System.out.println(str1.equals(str2));  //true Hello World equals Hello World
		System.out.println("================================");
		
		String str5 = new String("Hello World"); //123
		System.out.println(str5);
		//String str6 = new String("Hello World"); //456
		String str6 = new String("My World");
		System.out.println(str6);
		String str7 = new String("Hello World"); //789
		System.out.println(str7);
		
		System.out.println(str5 == str6);  //false false
		System.out.println(str5 == str7);  //false
		
		System.out.println(str5.equals(str6));  //false true Hello World equals Hello World
		
	}

}
