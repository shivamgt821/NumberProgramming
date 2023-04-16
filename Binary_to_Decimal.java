import java.util.Scanner;
class Binary_to_Decimal
{
	public static void main(String [] args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a binary number");
	int biNum=scn.nextInt();
	int Position=1;
	int decNum=0;
	int rem=0;
	while(biNum>0)
	{
		rem=biNum%10;
		decNum=(rem*Position)+decNum;
		biNum=biNum/10;
		Position=Position*2;
	}
	
	System.out.println("decimal num = "+decNum);
	}
}
