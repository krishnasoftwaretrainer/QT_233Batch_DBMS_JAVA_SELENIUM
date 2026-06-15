package loopingStatements;

public class ForLoop {

	public static void main(String[] args) {
		//Print 1 to 10 Numbers
		
		/*
		for(int i=1;i<=10;i++)  //1<=10T 2<=10T..11<=10F
		{
			//System.out.println(i);//1  2  SC MR 
			System.out.print(i+"   ");//1  2  SR MC
		}  */
		
		//Print 10 to 1 Numbers
		/*
		for(int i=10;i>=1;i--)  //10>=1 9>=1 8>=1 1>=1 0>=1
		{
			System.out.println(i);
		}  */
		
		//Infinite Loop 
		
		/*
		for(int i=1;i>=1;i++) //1>=1 2>=1 3>=1 4>=1 
		{
			//System.out.println(i);
			System.out.println("Quality Thought");
		} */
		
		//Print Even Number from 2 to 20
		
		/*
		for(int i=2;i<=20;i+=2) //2<=20T 3<=20T;  i=i+2;2+2=4 4+2=6
		{
			System.out.println(i);
		}  */
		
		//Print Odd Numbers 1 to 20
		/*
		for(int i=1;i<=20;i+=2)
		{
			System.out.println(i);
		}  */
		
		//Print Odd Numbers from 20 to 1
		
		for(int i=19;i>=1;i-=2)  //19<=1F Exit 
		{
			System.out.println(i);
		}
		
	}

}
