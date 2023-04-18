import java.util.Scanner;

public class Strong_Num {
	public static void main(String [] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number to check strong or not : ");
		int num=scn.nextInt();
		int temp = num;
		int sum=0;
		while(num>0) 
		{
			int rem=num%10;
			int fact=1;
			for(int i = 1; i<=rem;i++) fact = fact * i;

			sum = sum + fact;
			num=num/10;
		}
		if(sum == temp)System.out.println("Strong number");  
		else System.out.println("Not a Strong number");
	}
}
