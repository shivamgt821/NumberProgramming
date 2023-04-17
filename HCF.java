import java.util.Scanner;

class HCF
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scn.nextInt();
		System.out.println("enter the second number");
		int b=scn.nextInt();
		int n=a>b?a:b;
		while(true) 
		{
		if(a%n==0 && b%n==0 ) break;
          n--;
          }
		
		System.out.println("HCF of given number is : "+n);
	  
	}
}
