public class PrimeNumberSum {
	
	static boolean isPrime(int num) {
		if (num<=1) return false;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	static int sumOfRange(int start, int end) {
		int sum = 0;
	
		for(int i=start; i<=end ; i++) {
			if(isPrime(i)) sum = sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int startRange = 1;
		int endRange = 100;
		int sumOfResult = sumOfRange(startRange,endRange);
		System.out.println("Sum of prime numbers between " + startRange + " and " + endRange +" is :"+ sumOfResult);
	}

}
