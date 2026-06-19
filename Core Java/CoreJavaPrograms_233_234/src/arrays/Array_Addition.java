package arrays;

import java.util.Scanner;

public class Array_Addition 
{

	public static void main(String[] args) 
	{
Scanner scan = new Scanner(System.in);
		
		//First Array
		System.out.print("Enter Array Row Size: ");  //3
		int rows=scan.nextInt();
		
		System.out.print("Enter Array Column Size: ");  //2
		int cols=scan.nextInt();
		
		int a[][]=new int[rows][cols];  //2Rows 3Columns 
		
		System.out.println("Enter First Array Elements");
		
		//for(int i=0;i<rows;i++)
		for(int i=0;i<a.length;i++)  //2:0 1
		{
			for(int j=0;j<a[i].length;j++) //a[0]=3,00 01 02 a[1]=3 10 11 12
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		//Second Array
		
		int b[][]=new int[rows][cols];  //2Rows 3Columns 
		
		System.out.println("Enter Second Array Elements");
		
		//for(int i=0;i<rows;i++)
		for(int i=0;i<b.length;i++)  //2:0 1
		{
			for(int j=0;j<b[i].length;j++) //a[0]=3,00 01 02 a[1]=3 10 11 12
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		//Third Array 
		int c[][]=new int[rows][cols];  //2Rows 3Columns 

		System.out.println("Array Addition:");
		
		
		for(int i=0;i<c.length;i++)  //2:0 1
		{
			for(int j=0;j<c[i].length;j++) //a[0]=3,00 01 02 a[1]=3 10 11 12
			{
				
				//c[i][j]=a[i][j]+b[i][j];
				c[i][j]=a[i][j]-b[i][j];
				
				System.out.print(c[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
