package cda3103_project1;

import java.util.Scanner;

/**
 *
 * @author nicoqueijo
 */
public class DecimalConverterTester {

    /**
     * Converts either a binary, decimal, or hexadecimal value entered 
     * by the user into the other two forms and displays it on the console.
     * Binaries are entered prefixed by the % character.
     * Hexadecimals are entered prefixed by the $ character.
     * Decimals are entered without a prefix.
     * @param args Command-line arguments are not used in this program.
     */
    public static void main(String[] args) {
        String binaryValue;
        String decimalValue;
        String hexValue;

        Scanner scan = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter an integer in either binary, decimal, or hexadecimal: ");
        String userValue = scan.nextLine();

        // Check first character
        char first = userValue.charAt(0);

        
        switch (first) {
        // Binary
            case '%':
                binaryValue = userValue.substring(1, userValue.length());
                decimalValue = DecimalConverter.binToDec(binaryValue);
                hexValue = DecimalConverter.decToHex(decimalValue);
                break;
        // Hexadecimal
            case '$':
                hexValue = userValue.substring(1, userValue.length());
                decimalValue = DecimalConverter.hexToDec(hexValue);
                binaryValue = DecimalConverter.decToBin(decimalValue);
                break;
        // Decimal
            default:
                decimalValue = userValue;
                binaryValue = DecimalConverter.decToBin(decimalValue);
                hexValue = DecimalConverter.decToHex(decimalValue);
                break;
        }

        System.out.println("%" + binaryValue + " = " + decimalValue + " = " + "$" + hexValue);
    }
}
