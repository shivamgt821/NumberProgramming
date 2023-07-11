public class OctalToDecimal {

	    public static void main(String[] args) {
	        String octalNumber = "127";
	        int decimalNumber = convertOctalToDecimal(octalNumber);
	        System.out.println("Octal Number: " + octalNumber);
	        System.out.println("Decimal Number: " + decimalNumber);
	    }

	    public static int convertOctalToDecimal(String octalNumber) {
	        int decimalNumber = 0;
	        int power = 0;

	        // Iterate through each digit of the octal number from right to left
	        for (int i = octalNumber.length() - 1; i >= 0; i--) {
	            int digit = Character.getNumericValue(octalNumber.charAt(i));
	            decimalNumber += digit * Math.pow(8, power);
	            power++;
	        }

	        return decimalNumber;
	    }
	

}
