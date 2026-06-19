package arrays;

import java.util.Scanner;

public class Double_DimensionArray_DynamicWay 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int a[][]=new int[2][6];  //2Rows 3Columns 
		
		System.out.println("Array Elements");
		
		for(int i=0;i<a.length;i++)  //2:0 1
		{
			for(int j=0;j<a[i].length;j++) //a[0]=3,00 01 02 a[1]=3 10 11 12
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Given Array:");
		for(int i=0;i<a.length;i++)  //Rows:4  0<4T 1<4T 
		{
			for(int j=0;j<a[i].length;j++)         //3 
			{
				System.out.print(a[i][j]+"  ");
				
			}
			System.out.println();
		}

		
	}

}
