import java.util.Scanner;
public class NeonNum 
{
	static int power(int base,int exp)
	{
		int pow=1;
		for(int i=1;i<=exp;i++)
		{
			pow=pow*base;
		}
		return pow;
	}
	static int sumNum(int a)
	{
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+rem;
			a/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter any Number : ");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		if (num<0) System.out.println("Pls dont give negative number");
		else {
			int powResult=power(num,2);
			int sumResult=sumNum(powResult);
			
			if (num==sumResult) System.out.println("Number is Neon Number");
			else System.out.println("Not Neon Number");
		 }
	}
}
