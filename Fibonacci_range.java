import java.util.Scanner;
class Fibonacci_range
{
	public static void main(String[] args)
	{
	
	Scanner scn=new Scanner(System.in);
	System.out.print("enter the lower range : ");
	int l=scn.nextInt();
	System.out.print("enter the upper range : ");
	int u=scn.nextInt();
	int a=0,b=1,c;
	for(int i=l; i<=u; i++)
	//while(a<=u)
		{
			if(a>=l)
		 System.out.print(a + "\t" );
		c=a+b;
		a=b;
		b=c;
		
	   
	    }
	}
}
