import java.util.*;
class A  {
	
	public static int m1(int i, int j){
		int a,b,c;
		a = i;
		b = j;
		c = a+b;
		return c;
	}

	public static int m2(int u, int v) {
		int a,b,c;
		a = u;
		b = v;
		c = a-b;
		return c;
	}
	
	public static int m3(int p,int q) {
		int a,b,c;
		a = p;
		b = q;
		c = a*b;
		return c;
	}
	
	public static int m4(int m,int n) {
		int a,b,c;
		a = m;
		b = n;
		c = m/n;
		return c;
	}
	
	public static int m5(int s,int t ) {
		int a,b,c;
		a = s;
		b = t;
		c = s%t;
		return c;
	}	
}	
public class Arithmetic_Oprts {
	public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter 1st number : ");
	int a=scn.nextInt();
	System.out.println("Enter 2nd number : ");
	int b=scn.nextInt();
	System.out.println("The Sum of the two number is : "+A.m1(a,b));
	System.out.println("The Subtract of the two number is : "+A.m2(a,b));
	System.out.println("The Multiplication of the two number is : "+A.m3(a, b));
	System.out.println("The Division of the two number is : "+A.m4(a,b));
	System.out.println("The Modulous of the two number is : "+A.m5(a, b));
	}
}

