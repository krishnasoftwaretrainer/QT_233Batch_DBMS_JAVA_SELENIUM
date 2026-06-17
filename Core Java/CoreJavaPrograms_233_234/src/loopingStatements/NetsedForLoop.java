package loopingStatements;

public class NetsedForLoop {

	public static void main(String[] args)
	{

     /* 1 2 3 4 5
      * 1 2 3 4 5
      * 1 2 3 4 5
      * 1 2 3 4 5
      * 1 2 3 4 5 
      */
		
		/*	1	1	1	1	1
		 *  2	2	2	2	2
		 *  3	3	3	3	3
		 *  4	4	4	4	4
		 *  5	5	5	5	5
		 * 
		 */
		
		/* #	#	#	#	
		 * #	#	#	#
		 * #	#	#	# 
		 */
		//SR MC or MR SC MR MC 
		/*
		for(int i=1;i<=5;i++)  //Rows //1<=5T 2<=5T
		{
			for(int j=1;j<=5;j++) //Columns 1<=5T 2<=5T 3<=5T 4<=5 5<=5T 6<=5F
			{
				//System.out.print(j+"  ");
				System.out.print(i+"  ");
			}
			
			System.out.println();
		} */
		
		/*
		for(int i=1;i<=3;i++)  //Rows //1<=5T 2<=5T
		{
			for(int j=1;j<=4;j++) //Columns 1<=5T 2<=5T 3<=5T 4<=5 5<=5T 6<=5F
			{
				//System.out.print("#  ");
				System.out.print("QT   ");
			}
			
			System.out.println();
		}
		*/
		
		/* 1
		 * 1	2
		 * 1	2	3
		 * 1	2	3	4
		 * 1	2	3	4	5
		 */
		
		/*
		for(int i=1;i<=10;i++) //1<=5T 2<=5T 3 4 5
		{
			for(int j=1;j<=i;j++) //1<=1T 2<=1F,1<=2T,2<=2T 3<=2F 1times 2times 3times 4times 5times
			{
				
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}   */
		
		
		/* 5	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 * 5	4	3	2	1
		 */
		
		/*
		for(int i=1;i<=5;i++)  //Rows //5>=1T 4>=1T
		//for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--) //Columns 5>=1T 4>=1 3>=1 2>=1 1>=1 0>=1F
			{
				//System.out.print(j+"  ");
				System.out.print(i+"  ");
			}
			
			System.out.println();
		}  */
		
		/* 5	4	3	2	1
		 * 5	4	3	2
		 * 5	4	3
		 * 5	4
		 * 5
		 */
		
		
		for(int i=1;i<=5;i++)  //1<=5T 2<=5T 3>=5T
		{
			for(int j=5;j>=i;j--)  //5times 4times 3times 2times 1time  
					//5>=1 4>=1 3>=1 2>=1 1>=1 0>=1F
					//5>=2 4>=2 3>=2 2>=2 1>=2
					//5>=3
			{
				
				System.out.print(j+"  ");
				//System.out.print("  *  ");
			}
			
			System.out.println();
		}
		
	}

}
