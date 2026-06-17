package loopingStatements;

public class Tables_Loops {

	public static void main(String[] args) {
		// 5th Table
		
		/* 5 * 1 = 5
		 * 5 * 2 = 10
		 * 5 * 3 = 15
		  */
		/*
		for(int i=1;i<=10;i++)  //Executes this Body 10Times
		{
			System.out.println("5  *  " + i + " = "+(5*i));
		}  */

		//Print 2 to 10Tables 
		
		for(int i=2;i<=20;i++)  //19Times
		{
			for(int j=1;j<=20;j++) //90Times  11<=10
			{
				System.out.println(i+"  *  " + j + " = "+(i*j));
			}
			System.out.println("================");
		}
	}

}
