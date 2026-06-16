package loopingStatements;
import java.util.Scanner;

public class ATM_Switch_Loop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
        
		//for(int i=1;i<=5;i++)  //Fixed Execution
		
		while(true)  //Infinite Execution
		{
		int balance = 8000, withdraw, deposit; 
		
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT"); 
            
            System.out.println("Choose the operation you want to perform:");  
              
            int choice = sc.nextInt(); 
            
            switch(choice)  
            {  
            case 1:  //Withdraw
            	
        System.out.println("Enter money to be withdrawn:");  
                      
        withdraw = sc.nextInt();  //2000  8000
                      
        if(balance >= withdraw)  //6000>=2000:True  6000>=8000:False
        {   
            balance = balance - withdraw;  //6000-2000=4000 -= Assignment Operator
            System.out.println("You are Withdrawing: "+withdraw);
            System.out.println("Your Current Balance: "+balance );
            System.out.println("Please collect your money"); 
        }  
        
        else  
        {  
              
            System.out.println("Insufficient Balance"); 
            System.out.println("Your Current Balance: "+balance ); //6000
            System.out.println("You are trying to withdraw:"+withdraw); //8000
        } 
        
        System.out.println("");  
        break;  
   
          case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        deposit = sc.nextInt();  
      
        balance = balance + deposit;  //balance+=deposit  3000
        System.out.println("You are depositied " +deposit+" to your account successfully");  
        System.out.println("Your Current Balance: "+balance );
         System.out.println("");
         break;  
   
         case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        System.exit(0);
        
                default:
                	System.out.println("Choose only 1 to 4");
            } 
            
        } 
        
	}
}



