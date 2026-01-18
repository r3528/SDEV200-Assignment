import java.util.Scanner;

public class LetsCheckYourCard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your credit card number: "); 
        long cardNumber = input.nextLong();
        
         
        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is a valid credit card number.🎉"); // show when the card is valid
        } else {
            System.out.println(cardNumber + " is invalid.🥹"); //show when the card is invalid
        }

        input.close();
    }

    /** Check if the card number is valid */
    public static boolean isValid(long number) {
        int length = getSize(number);

        // Its need to have 13-16 digits 
        if (length < 13 || length > 16) {
            return false;
        }

        if (!(prefixMatched(number, 4) || prefixMatched(number, 5)
                || prefixMatched(number, 37) || prefixMatched(number, 6))) {
            return false;
        }

        // Luhn check
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return sum % 10 == 0;
    }

    /**  Double every second digit from right and sum digits */
    public static int sumOfDoubleEvenPlace(long number) {
        String numStr = Long.toString(number);
        int sum = 0;

        // Start from the second-to-last digit, move left
        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += getDigit(digit * 2);
        }

        return sum;
    }

    /** Return the number itself if single digit, otherwise sum of digits */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    
    public static int sumOfOddPlace(long number) {
        String numStr = Long.toString(number);
        int sum = 0;

        // Start from the last digit, move left skipping every other
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }

        return sum;
    }

    /** This is to check if the prefix of the number matches d */
    public static boolean prefixMatched(long number, int d) {
        int prefixLength = getSize(d);
        return getPrefix(number, prefixLength) == d;
    }

    
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    
    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        if (numStr.length() < k) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }
}



