package loopingStatements;

public class NestedForLoop_Patterns {

	public static void main(String[] args) 
	{
	
		/* 1  2   3  4   5
		 * 1  2   3  4   5
		 * 1  2   3  4   5
		 * 1  2   3  4   5
		 * 1  2   3  4   5
		 */
		//Nested For Loop Rows:5 Columns:5
		
		for(int i=1;i<=10;i++)  //Outer Loop:Executes 5 Times 
		{
			for(int j=1;j<=5;j++) //Inner Loop:Executes 5 Times
			{
				System.out.print(j+"    ");
			}  //Exit Inner Loop
			System.out.println();  
				
			}  		}  	}

/* Explanation:
 * Outer Loop:
 * i=1;i<=5;1<=5;T  Outer Loop 
 * 
 * Inner Loop: 
 * j=1;j<=5;1<=5;T
 * j++  j=2;j<=5;2<=5;T
 * j++  j=3;j<=5;3<=5;T
 * j++  j=4;j<=5;4<=5;T
 * j++  j=5;j<=5;5<=5;T
 * j++  j=6;j<=5;6<=5;F  Inner Loop is False
 * 
 * Outer Loop: i++  i=2;i<=5;2<=5;True 
 * 
 * Inner Loop:
 * j=1;j<=5;1<=5;T
 * j=2;j<=5;2<=5;T
 * -----
 * ------
 * ---
 * Outer Loop: i++  i=3;i<=5;3<=5;True
 * Inner Loop:
 * --------
 * Outer Loop: i++  i=6;i<=5;6<=5;False  Outer Loop is False
 * 
 * 1	2	3	4	5
 * 
 * 1	2	3	4	5
 * 
 * 1	2	3	4	5
 * 
 * 1	2	3	4	5
 * 
 * 1	2	3	4	5
 */


