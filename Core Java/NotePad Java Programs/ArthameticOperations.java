import java.util.Scanner;
class ArthameticOperations
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter First Value:");
int a=scan.nextInt();
System.out.print("Enter Second Value:"); 
int b=scan.nextInt(); 
System.out.print("Enter Third Value:");
int c=scan.nextInt();
int sum=a+b+c;
int sub=a-b-c;
int mul=a*b*c;
int div=a/b/c;
System.out.println("Addition of given Two Numbers:"+sum);
System.out.println("Substraction of given Two Numbers:"+sub);
System.out.println("Multification of given Two Numbers:"+mul);
System.out.println("Division of given Two Numbers:"+div);
}
}