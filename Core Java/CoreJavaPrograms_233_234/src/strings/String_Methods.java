package strings;

public class String_Methods 
{

	public static void main(String[] args) 
	{
		//String Equal Method
		/*Common String Exceptions
		 * StringIndexOutOfBoundsException
		 * NullPointerException
		 */
		
		
		String str1 = "Products";
		String str2 = "products";
		
		System.out.println(str1.equals(str2));  //true CaseSensitive P not equal to p
		
		//System.out.println(str1==str2);  //false
		/*
		//Strin EqualIgnoreCase Method
		String str3 = "Products";
		String str4 = "products";
		System.out.println(str3.equalsIgnoreCase(str4));  //true not CaseSensitive P equal to p
		
		//String Contains Method check the partial value in the string and return boolean value
		String str5 = "Krishna123@gmail.com";
		System.out.println(str5.contains("@gmail.com"));  //true
	
		String str6 = "Ramesh123@gmail.com";
		System.out.println(str6.contains("@gmail.com"));  //true
	
		//String Length Method
		String str7 = " Hello World ";
		System.out.println(str7.length());  //11
		
		//String str7 =null;  //NullPointerException
		//System.out.println(str7.length());  //11
		/// 
		//String CharAt Method
		String str8 = "Hello World";  //H:0 e:1 l:2 l:3 o:4  :5 W:6 o:7 r:8 l:9 d:10
		System.out.println(str8.charAt(0));  //H
				
		//String UpperCase and LowerCase Method
		//UpperCase:Convert the Lower case string into upper case letters
		//LowerCase:Convert the Upper case string into lower case letters
		
		String str9 = "hello world";  
		System.out.println("Actual String: "+str9);  //hello world
		System.out.println("Upper Case String: "+str9.toUpperCase());  //HELLO WORLD
				
		String str10 = "HELLO WORLD";
		System.out.println("Actual String: "+str10);  //HELLO WORLD
		System.out.println("Lower Case String: "+str10.toLowerCase());  //hello world
			
		//String Trim()
		//It remove the whitespace from the beginning and end of the string but not in between the string
		//Leading and Trailing spaces are removed but not the in between spaces
		
		String str11 = "  Hello World  ";
		System.out.println("Actual String:"+str11);  //  Hello World
		System.out.println("Trimmed String:"+str11.trim());  //Hello World
		 
		//String Replace Method
		//It replace the old character with new character and return the new string
		//It replace the old substring with new substring and return the new string
		
		String str12 = "Hello World";
		System.out.println("Actual String:"+str12);  //Hello World
		//System.out.println("Replace Character String:"+str12.replace('H', 'P'));  //Hella Warld
	System.out.println("Replace Substring String:"+str12.replace("Hello", "Java"));  //Hello Java	
	
		//String is Immutable:Once the string is created it cannot be changed but we can create a new string with the modified value
		//String Concat Method
		
		String str13 = "Hello ";  //Str13 values in immutable
		String str14 = "World";
		String str16= " Java";
		
		System.out.println("Actual String 1:"+str13);  //Hello
		System.out.println("Actual String 2:"+str14);  //World
		System.out.println("Concatenated String:"+str13.concat(str14));  //Hello World
		System.out.println("Str13:"+str13);  //Hello
		System.out.println("Concatenated String:"+str13.concat(str16));  //HelloWorld Java
		
		String str15 = str13.concat(str14);
		System.out.println("Str15:"+str15);  //Hello World
		*/
		
	}

}
