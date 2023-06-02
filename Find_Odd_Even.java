import java.util.Scanner;

public class Find_Odd_Even {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = scn.nextInt();
		
		int countEven = 0;
		int countOdd = 0;
		
		while(num > 0) {
			
			int rem = num % 10;
			
			if(rem % 2 == 0) 
				countEven++;
			else {
				countOdd++;
			}
				num /= 10;	
		}
		System.out.println("The total even number is : "+countEven);
		System.out.println("The total odd number is : "+countOdd);
	}
}


