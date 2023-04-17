import java.util.Scanner;

class LCM
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter the first number : ");
		int a=scn.nextInt();
		System.out.print("enter the second number : ");
		int b=scn.nextInt();
		System.out.print("enter the third number : ");
		int c=scn.nextInt();
		int d=a>b ? a:b;
		int n=c>d ? c:d;
		while(true) 
		{
		if(n%a==0 && n%b==0 && n%c==0 ) 
			{
			break;
			}
        n++;
       }
		
		System.out.println("LCM of given number is : "+n);
	  
	}
}
