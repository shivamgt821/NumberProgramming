import java.util.Scanner;

public class CelsiustoFahrenheit  {
	
	public static void main(String[] args) {
		
		System.out.println("Enter temp in Celsius : ");
		Scanner scn = new Scanner(System.in);
		float temperature = scn.nextFloat();
		
		temperature = (temperature*9/5)+32;
		
		System.out.println("The temperature in Farhenheit "+temperature);
	}

}
