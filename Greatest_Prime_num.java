import java.util.Scanner;
class Greatest_Prime_num
{
	public static void main(String[] args)
	{
	System.out.print("Enter lower number : ");
	Scanner scn= new Scanner(System.in);
	int l=scn.nextInt();
	System.out.print("Enter upper number : ");
	int u=scn.nextInt();
	
	for(int i=u;i>=l;i--){
	boolean flag=true;
	if(i<=1) continue;

		for(int j=2;j<=i/2;j++) {
		if(i%j==0){
		flag=false;
		break;
		}
	}
	if(flag){
	System.out.println(i);
	// break;
	   }
	}
   }
}
