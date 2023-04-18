import java.util.Scanner;
class Swap_Without_third_var
{
	public static void main(String [] args) 
	{
		System.out.println("enter the value of x and y");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();

		System.out.println("before the swapping the value of " + x +" " + y );

		/* Swapping */

		x = x+y;
		y = x-y;
		x = x-y;

		System.out.println("After the swapping the value of " + x +" " + y );

	}
}
