
import java.util.Scanner;

class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}

public class BinaryChecker {

    // Convert binary string to decimal
    public static int bin2Dec(String binary) throws BinaryFormatException {
        if (binary == null || binary.isEmpty()) {
            throw new BinaryFormatException("Binary string cannot be empty.");
        }

        // Check for invalid characters
        for (char ch : binary.toCharArray()) {
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid character: " + ch);
            }
        }

        // Convert binary to decimal
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        try {
            int decimal = bin2Dec(binary);
            System.out.println("Decimal: " + decimal);
        } catch (BinaryFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

