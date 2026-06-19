package arrays;

import java.util.Scanner;

public class Single_DimensionArray_DynamicWay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// For Dynamic Array:Allocate the Memory for Array
		// Syntax: datatype arrayvariablename[]=new datatype[Size];

		int htno[] = new int[4]; // Max 5 Min 1

		System.out.println("Enter Array Elements");

		//for (int i = 0; i < 6; i++)
		for (int i = 0; i < htno.length; i++)
		{
			htno[i] = scan.nextInt(); // 101 102 103 104 105
		}

		 //for(int i=0;i<6;i++) //0 1 2 3 4T 5T 6F
		for (int i = 0; i < htno.length; i++) 
			 {
			// System.out.println(htno[i]);
			System.out.print(htno[i] + "   ");
		}

	}

}
