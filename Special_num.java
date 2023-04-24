import java.util.Scanner;
public class Special_num 
{
	static int sumNum(int num)
	{
		int sum=0;
		for(;num!=0;num/=10)
		{
			sum=sum+(num%10);
		}
		return sum;
	}
	static int rev(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter any Number : ");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		if(num<0) System.out.println("No Negatives");
		else 
		{
			
		}
	}
}
