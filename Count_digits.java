import java.util.Scanner;
class Count_digits
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int count=0;
		
		while(n>0)
		{
		n=n/10;
		count++;
	    }
		System.out.println("Number of digits " +count);
	}
}
	
