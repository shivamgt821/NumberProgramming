import java.util.Scanner;
class Factorial 
{
	public int fact(int num) {
		int fact = 1;
		for(int i=1; i<=num ; i++) 
		{
			fact = fact*i ;
		}
		return fact;
	}

	public int strong(int num) {
  
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			sum = sum + fact(rem);
			num = num/10;
		}
		return sum;
	}	
	public void calRange(int l, int u) {
		
		System.out.println("The strong numbers are : ");
		for(int i=l; i<=u; i++) {
			
			if(i == strong(i))
			System.out.println(i);
		}
	}
}
public class Strong_Num_Range {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter lower range : ");
		int a = scn.nextInt();
		System.out.print("Enter upper range : ");
		int b = scn.nextInt();
		Factorial obj = new Factorial();
		
		obj.calRange(a,b);
		
	}

}
