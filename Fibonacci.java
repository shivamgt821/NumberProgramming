import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
	System.out.print("enter the range : ");
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int a=0,b=1,c;
	while(a<=n)
		{
		 System.out.print(a + "\t" );
		c=a+b;
		a=b;
		b=c;
		
	   
	    }
	}
}
