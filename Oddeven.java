import java.util.Scanner;

class Oddeven
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the initial number");
		int a=scn.nextInt();
		System.out.println("enter the final number");
		int b=scn.nextInt();
		for(int i=a; i<=b; i++){
		if(i%2==0){
		System.out.println("the number "+i+" is even");
		}
		else{
		System.out.println("the number "+i+" is odd");
			}
		}
	}
}

		
