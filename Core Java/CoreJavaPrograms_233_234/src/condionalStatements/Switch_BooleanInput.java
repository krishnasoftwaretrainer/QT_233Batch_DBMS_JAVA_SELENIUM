package condionalStatements;
import java.util.Scanner;
public class Switch_BooleanInput {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Is it Raining? (true/false)");
		boolean isRaining=scan.nextBoolean();
      
      switch(isRaining)
	  {
      case true:
	  {
		  System.out.println("Take an Umbrella");
		  break;
	  }
	  
	  	  case false:
	  {
		  System.out.println("Enjoy the day");
		  break;
	  }
	  
	  default:
	  {
		  System.out.println("Invalid Input");
	  }
	  
	  }
      
	
	
	}

}
