import java.util.Scanner;
class Decimal_to_Binary
{
	public static void main(String [] args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.print("enter a decimal number : ");
	int decNum=scn.nextInt();
	long Position=1;
	long biNum=0;

	while(decNum>0){
	int rem=decNum%2;
	biNum=(rem*Position) + biNum;
	decNum=decNum/2;
	Position=Position*10;
	}
	System.out.print("binary = "+biNum);
	}
}
