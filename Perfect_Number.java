import java.util.Scanner;
class Perfect_Number
{
	public static void main(String [] args)
	{
	System.out.print("Enter a number : ");
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int sum=0;
	for(int i=1;i<=num/2;i++)
	{
	if(num%i==0)
	sum=sum+i;
	}
	if(sum==num){
	System.out.print(num+" is a Perfect number");
	} else {
	System.out.print(num+" is not a Perfect number");
	}
	}
}
