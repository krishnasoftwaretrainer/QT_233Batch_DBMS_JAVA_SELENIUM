package arrays;

public class Single_DimensionArray_StaticWay {

	public static void main(String[] args) 
	{
		//Read the given array values and Print in Console
		//datatypes arrayname[]={element1,emement2,...};
		//SR MC or SC MR  
		
		int htno[]= {101,102,103,104,105,106};
		/* htno[0]=101, htno[1]=102 htno[2]=103 htno[3]=104 htno[4]=105
		 * 
		 * 
		 */
		
		//for(int i=0;i<6;i++)  //0 1 2 3 4T   5T 6F
		for(int i=0;i<htno.length;i++)
		{
			//System.out.println(htno[i]);
			System.out.print(htno[i]+"   ");
		}
		
		// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		
	}

}
