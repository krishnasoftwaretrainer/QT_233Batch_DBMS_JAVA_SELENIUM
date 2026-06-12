package condionalStatements;
import java.util.Scanner;
public class Else_IF_LadderIf {

	public static void main(String[] args) {
		/* Student Result:A B C D Fail  40  95
		 * Student Marks must be between 0 to 100
			Obtained Marks between: 85 to 100 A Grade
			                        70 to 84 B Grade
			                        55 to 69 C Grade
			                        35 to 54 D Grade
			                        0 to 34 Fail 
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Student Obtained Marks");
		int ObtainedMarks = scan.nextInt();
		
		if(ObtainedMarks>=85 && ObtainedMarks<=100)  //85>=85:T 85<=100:T
		{
			System.out.println("A Grade");  //A Grade TBS
		}  //Exit 
		
		else if(ObtainedMarks>=70 && ObtainedMarks<85)  //70>=70:T 70<85:T
		{
			System.out.println("B Grade");  //B Grade
		}
		
		else if(ObtainedMarks>=55 && ObtainedMarks<70)  //55>=55:T 55<70:T
		{
			System.out.println("C Grade");
		}
		
		else if(ObtainedMarks>=35 && ObtainedMarks<55)  //35>=35:T 35<55:T
		{
			System.out.println("D Grade");
		}
		
		else if(ObtainedMarks>=0 && ObtainedMarks<35)  //0>=0:T 0<35:T
		{
			System.out.println("Fail");
		}
		
		else
		{
			System.out.println("InValid Marks");
		}
		}
		
	}


