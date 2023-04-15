import java.util.Scanner;
class Reverse_Num
{
	public static void main(String[] args)
	{
		int num,rem;
		System.out.print("Enter any number ");
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
        int rev=0;
	
	    while(num>0)
	    {
	    rem=num%10;
	    rev=(rev*10)+rem;
	    num=num/10;
		}
		System.out.print(rev);
    }
}
