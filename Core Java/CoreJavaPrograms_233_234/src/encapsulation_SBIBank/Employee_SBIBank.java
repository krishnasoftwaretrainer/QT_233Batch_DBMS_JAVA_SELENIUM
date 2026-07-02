package encapsulation_SBIBank;

public class Employee_SBIBank 
{
	public static void main(String[] args) 
	{
		//Same Package and Different Class
		Customer1_SBIBank c1=new Customer1_SBIBank();
		
		//c1.setAccname("Ramesh");
		c1.setAccno(123456789);
		c1.setBalance(9000.00);
		
		System.out.println("Account Name: "+c1.getAccname());
		System.out.println("Account Number: "+c1.getAccno());
		System.out.println("Account Balance: "+c1.getBalance());
		
		
		/*
		System.out.println("Account Name: "+c1.accname);
		System.out.println("Account Number: "+c1.accno);
		System.out.println("Account Balance: "+c1.balance);
		*/
		
	}

}
