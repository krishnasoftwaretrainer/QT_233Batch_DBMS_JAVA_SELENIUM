package loopingStatements;

public class Diff_For_While_DoWhile {

	public static void main(String[] args) {

			/*	
		for(int i=5;i<5; i++)  //5<5 F
		{
			System.out.println(i);
		}  */
		
		/*
		int i=5;
		while(i<5)  //5<5 F
		{
			System.out.println(i);
			i++;
		}  */
		
		int i=5;
		do
		{
			System.out.println(i);  //5
			i++;  //6
	}while(i<5);  //6<5 F
		
	}

}
