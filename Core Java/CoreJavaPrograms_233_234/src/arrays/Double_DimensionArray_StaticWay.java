package arrays;

public class Double_DimensionArray_StaticWay 
{

	public static void main(String[] args) 
	{
	
		int a[][]= {{1,2,3,0},{4,5,6,0},{7,8,9,0}};  //Size: 3*3=9 3*4=12
		
		//for(int i=0;i<3;i++)  //Rows Outer:3 R0 R1
		
		for(int i=0;i<a.length;i++)  //Rows:4  0<4T 1<4T 
		{
			//for(int j=0;j<4;j++)  //Columns Inner:12 R0C0 R0C1 R0C2 R0C3, R1C0 R1C1 R1C2 R1C3 R1C4
			
			for(int j=0;j<a[i].length;j++)         //3 
			{
				System.out.print(a[i][j]+"  ");
				
			}
			System.out.println();
		}
		
	}

}
