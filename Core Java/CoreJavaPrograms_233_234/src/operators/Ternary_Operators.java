package operators;
import java.util.Scanner;
public class Ternary_Operators {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Your Marks:");
		int ObtainedMarks=scan.nextInt();
		
		//boolean result=ObtainedMarks>=35?true:false;  //80>=35 true
		String result=ObtainedMarks>=35?"Fail":"Pass";
						//33>=35 false
		
		 System.out.println("Result:"+result);
		
		
	}

}
