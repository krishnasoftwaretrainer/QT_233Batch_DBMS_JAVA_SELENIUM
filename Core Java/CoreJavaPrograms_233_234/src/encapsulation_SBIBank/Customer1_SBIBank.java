package encapsulation_SBIBank;

public class Customer1_SBIBank 
{
	//Global Instance variables
	
	private String accname="Mohan";  
	private int accno;    
	private double balance=7000.00;   
	
	//Private:Same Package and Same Class
	
	//private String accname="Krishna";  //Project Level
	//private int accno=123456789;    //Package Level
	//private double balance=5000.00;   //Class Level
	
	//Getter [get keyword is used to get the value of private variable]
	
	public String getAccname() 
	{
		return accname;
	}
	
	public int getAccno() 
	{
		return accno;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	//Setter Method [set keyword is used to set the value of private variable]
	
	public void setAccname(String accname) 
	{
		this.accname = accname;
	}
	
	public void setAccno(int accno) 
	{
		this.accno = accno;
	}
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	/*
	public static void main(String[] args) 
	{
		Customer1_SBIBank c1=new Customer1_SBIBank();
		System.out.println("Account Name: "+c1.accname);
		System.out.println("Account Number: "+c1.accno);
		System.out.println("Account Balance: "+c1.balance);
		
	} */

}
