import java.util.Scanner;
class Prime_num_range
{
	public static void main(String[] args)
	{
	System.out.print("Enter lower number : ");
	Scanner scn= new Scanner(System.in);
	int l=scn.nextInt();
	System.out.print("Enter upper number : ");
	int u=scn.nextInt();

		for(int i=l;i<=u;i++)
		{
			if(i<=1)continue;
			
			boolean flag=true;

			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				flag=false;
				break;
				}
			}
				if(flag==true)
				System.out.println(i);
		}
	}
}

