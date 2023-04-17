import java.util.Scanner;
class Greatest_Num 
{
	public static void main(String [] args ) 
	{
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter Any Number : ");
	int num = scn.nextInt();
	int greatest = 0;

	//while(num>0) 
	for(int i=0; i<=num; i++)
	{
	int rem = num%10;
	if(rem > greatest) 
	
	greatest = rem;
	num = num/10;
	}
		System.out.print("The Greatest digit of given number is : " + greatest);
	}
	
} 
