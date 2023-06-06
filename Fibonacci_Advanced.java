import java.util.ArrayList;

public class Fibonacci_Advanced {
public static void main(String[] args) {
		
		ArrayList<Integer> a= fib(0,5);
		int n=a.size();

		int l=a.size()-2;
		int b=0;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
				
				if(i+j==n+1) {
					System.out.print(a.get(b++));
					}
				else if (j==i-n+1) {
					System.out.print(a.get(l--));
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		
		
	}
	
	public static ArrayList<Integer>  fib(int lr,int hr) {
		
		int a=lr,b=a+1,f=0;
		ArrayList<Integer> arry=new ArrayList<Integer>();
		while(lr<=hr) {
			
			if(a>=lr)
			arry.add(a);

			if(a>hr)
				break;
			
			f=a+b;
			a=b;
			b=f;
		}
		
		return arry;
	}

}
