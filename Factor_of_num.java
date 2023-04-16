import java.util.Scanner;
class Factor_of_num
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
