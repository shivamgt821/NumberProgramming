import java.util.Scanner;
class Ugly_num
{
	public static void main(String[] args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("enter any number");
	int n=scn.nextInt();
	if((n%2==0)||(n%3==0)||(n%5==0))
	System.out.println(n+ " is an ugly number");
	else 
	System.out.println(n+ " is not an ugly number");
	
	}
}
