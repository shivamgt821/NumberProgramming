import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		int num=new Scanner(System.in).nextInt();
		int rem,rev=0,c=num;
		while(num>0)
		{
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
		}
		if(c==rev)
		System.out.println("Number is palindrome");
		else
		System.out.println("Not A palindrome");
	}
}

		
