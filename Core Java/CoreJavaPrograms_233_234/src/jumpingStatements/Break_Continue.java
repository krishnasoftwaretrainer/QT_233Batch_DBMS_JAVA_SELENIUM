package jumpingStatements;

public class Break_Continue {

	public static void main(String[] args)
	{
		//LBNagar to Miyapur  10 Signals 
		
		for(int i=1;i<=10;i++)  //1<=10T 2 3 4 5 6 7 11F
		{
			//if(i==5)  //1==5F 2F 3 4 5==5T 6==5F 7
			//if(i<=5)  //1<=5
			
			if(i>=5)  //1>=5 2>=5   6>=5 7>=5 8>=5 9>=5
			{
				//break;  //Stop
				continue;
			}
			
			System.out.println(i); //1 2 3 4 6 7 8 9 10 
		}

		
	}

}
