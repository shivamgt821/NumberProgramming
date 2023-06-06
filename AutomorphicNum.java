import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		System.out.println("Enter any number :");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int len = (""+n).length();
		int sq = n*n;
		int res = sq%(int)Math.pow(10, len);
		
		if(n==res) System.out.println("It is Automorphic number");
		else System.out.println("It is Not Automorphic number");
	}

}
