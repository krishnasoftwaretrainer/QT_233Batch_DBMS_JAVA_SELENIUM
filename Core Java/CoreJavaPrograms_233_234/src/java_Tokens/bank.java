package java_Tokens;

public class bank 
{
	public static void main(String[] args) {
		customer cu=new customer();
		
		cu.setAccname("Ramesh");
		cu.setBalance(5000);
		cu.setAccnum(5678);
		
		
		System.out.println(cu.getAccname());
		System.out.println(cu.getBalance());
		System.out.println(cu.getAccnum());
		
	}
}
