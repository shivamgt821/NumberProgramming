import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		System.out.println("Enter temprature in Fahrenheit: ");
		Scanner scn = new Scanner(System.in);
		float temprature = scn.nextInt();
		
		temprature = (temprature-32)*5/9;
		
		System.out.println("The Celsius of Farhenheit is "+temprature);
		
	}

}
