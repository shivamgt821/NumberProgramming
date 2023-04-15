import java.util.Scanner;
class Alternative_Prime_num
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter lower number : ");
		int l=scn.nextInt();
		System.out.print("Enter upper number : ");
		int u=scn.nextInt();
		int count=0;
		
			for(int i=l;i<=u;i++)
			{
			boolean flag=true;
			if(i<=1) continue;

				for(int j=2;j<=i/2;j++) 
				{
				if(i%j==0){
				flag=false;
				break;
				}
			}
			if(flag)
			{
			count++;
			if(count%2!=0)
			System.out.println(i);
	   		}
		}
    }
}
