package arrays;

import java.util.Scanner;

public class MultiDimensionArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//First Array
		System.out.print("Enter First Array Row Size: ");
		int frows=scan.nextInt();
		
		System.out.print("Enter First Array Column Size: ");
		int fcols=scan.nextInt();
		
		int a[][]=new int[frows][fcols];  //2Rows 3Columns 
		
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
		
		System.out.print("Enter Second Array Row Size: ");
		int srows=scan.nextInt();
		
		System.out.print("Enter Second Array Column Size: ");
		int scols=scan.nextInt();
		
		int b[][]=new int[srows][scols];  //2Rows 3Columns 
		
		System.out.println("Enter Second Array Elements");
		
		//for(int i=0;i<rows;i++)
		for(int i=0;i<b.length;i++)  //2:0 1
		{
			for(int j=0;j<b[i].length;j++) //a[0]=3,00 01 02 a[1]=3 10 11 12
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("First Array:");
		for(int i=0;i<a.length;i++)  //Rows:4  0<4T 1<4T 
		{
			for(int j=0;j<a[i].length;j++)         //3 
			{
				System.out.print(a[i][j]+"  ");
				
			}
			System.out.println();
		}

		System.out.println("Second Array:");
		for(int i=0;i<b.length;i++)  //Rows:4  0<4T 1<4T 
		{
			for(int j=0;j<b[i].length;j++)         //3 
			{
				System.out.print(b[i][j]+"  ");
				
			}
			System.out.println();
		}
	}

}
