import java.util.Scanner;
class Table
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("provide any number :");
		int a=scn.nextInt();
		System.out.print("enter the start value :");
		int b=scn.nextInt();
		System.out.print("enter the end value : ");
		int c=scn.nextInt();
		
		for(int i=b; i<=c; i++){
		int d=a*i;
		System.out.println(a+"*"+i+"="+d);
		}
	}
}
