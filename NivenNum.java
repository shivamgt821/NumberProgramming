import java.util.Scanner;
public class NivenNum 
{
	public static int sumNum(int a)
	{
		int sum=0;
		while(a>0) // while(a!=0)
		{
			int rem=a%10;
			sum+=rem;
			a/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter any Number : ");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int result=sumNum(num);
		
		if(num%result==0) System.out.println("Number is  Niven Number");
		else System.out.println("Not Niven Number");
	}
}

