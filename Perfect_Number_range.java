import java.util.Scanner;
class Perfect_Number_range
{
	public static void main(String [] args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter First number : ");
	int l=scn.nextInt();
	System.out.print("Enter Second number : ");
	int u=scn.nextInt();
	int sum,count=0;
	for(int i=l;i<=u;i++){
	int sum=0;
	if(num%i==0)
	sum=sum+i;
	}
	if(sum==num){
	System.out.print(num+" is a Perfect number");// 6,28,496,8128,33550336 is perfect no
	} 
	
	}
}
