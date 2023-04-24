import java.util.Scanner;
public class Magic_Num 
{
	static int magic(int a)
	{
		while(a>9) 
		{
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+rem;
			a/=10;
		}
		a=sum;
	}
		return a;
}
	public static void main(String[] args) {
		System.out.println("Enter any number : ");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int result=magic(num);
		if(result==1) System.out.println("It's Magic Number");
		else  System.out.println("Not a Magic Number");
		
		}
}
