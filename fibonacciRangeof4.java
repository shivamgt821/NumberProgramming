import java.util.Scanner;


public class fibonacciRangeof4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the start range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end range: ");
        int end = scanner.nextInt();
        
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = fib1 + fib2;
        int result = 0;
        
        while (fib3 <= end) {
            if (fib3 >= start && fib3 % 4 == 0) {
                result = fib3;
                break;
            }
            
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
        }
        
        System.out.println("The first Fibonacci number that is also a multiple of 4 in the given range is: " + result);
    }
}
