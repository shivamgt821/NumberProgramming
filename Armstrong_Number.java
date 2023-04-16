import java.util.Scanner;
class Armstrong_Number
{
	public static void main(String [] args)
	{
	System.out.print("Enter a number : ");
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int temp=num;
	int count=0;
	
	while(num>0){
	count++;
	num=num/10;
	}

	num=temp;
	int sum=0;
	
	while(num>0){
	int rem=num%10;

	int Prod=1;
	for(int i=1; i<=count; i++){
	Prod=Prod*rem;
	}
	
	sum=sum+Prod;
	num=num/10;
	}
	
	if(sum==temp){
	System.out.print(temp + " is an Armstrong number");
	} else{
	System.out.print(temp + " is Not an Armstrong number");
		}
	}
}
