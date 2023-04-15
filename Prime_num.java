import java.util.Scanner;

class Prime_num
{
	public static void main(String[] args)
	{
	System.out.print("enter the number : ");
	Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

		if(n<=1)
		{
		System.out.print(n+ " is not a prime number : ");
		return;
		}

		boolean flag=true;
		for(int i=2; i<=n/2;i++)
		{
				if(n%i==0)
				{
				System.out.print(n+ " is not a prime number : ");

				flag=false;
				break;
			    }
		}
				if(flag)
				{
			    System.out.print(n+ " is a prime number : ");
				}
	 }
}
