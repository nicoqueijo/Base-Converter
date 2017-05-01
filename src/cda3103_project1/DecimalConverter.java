package cda3103_project1;

/**
 *
 * @author nicoqueijo
 */
public class DecimalConverter {

    private final static int OFF_BY_ONE = 1;
    private final static int BASE_TWO = 2;
    private final static int BASE_SIXTEEN = 16;
    private final static String HEX_TABLE = "0123456789ABCDEF";

    /**
     * Converts a binary number to its decimal value using base multiplication.
     * @param binaryValue The input as a binary.
     * @return The output as a decimal.
     */
    public static String binToDec(String binaryValue) {
        int result = 0;
        int exponent;
        int binLength = binaryValue.length();

        for (int i = 0; i < binLength; i++) {
            char ch = binaryValue.charAt(i);
            if (ch == '1') {
                exponent = binLength - i - OFF_BY_ONE;
                result += (int) Math.pow(BASE_TWO, exponent);
            }
        }

        return "" + result;
    }

    /**
     * Converts a hexadecimal number to its decimal value using base multiplication.
     * @param hexValue The input as a hexadecimal.
     * @return The output as a decimal.
     */
    public static String hexToDec(String hexValue) {
        int result = 0;
        int hexLength = hexValue.length();
        hexValue = hexValue.toUpperCase();
        int exponent;

        for (int i = 0; i < hexLength; i++) {
            char ch = hexValue.charAt(i);
            exponent = hexLength - i - OFF_BY_ONE;
            result += (int) Math.pow(BASE_SIXTEEN, exponent) * HEX_TABLE.indexOf(ch);
        }

        return "" + result;
    } 

    /**
     * Converts a decimal number to its binary value using repeated division.
     * @param decimalValue The input as a decimal.
     * @return The output as a binary.
     */
    public static String decToBin(String decimalValue) {
        int valueAsNum = Integer.parseInt(decimalValue);

        int quotient = valueAsNum;
        int remainder;
        String result = "";

        do {
            remainder = quotient % BASE_TWO;
            result = remainder + result;
            quotient = quotient / BASE_TWO;

        } while (quotient != 0);

        return result;
    }

    /**
     * Converts a decimal number to its hexadecimal value using repeated division.
     * @param hexValue The input as a decimal.
     * @return The output as a hexadecimal.
     */
    public static String decToHex(String hexValue) {
        int valueAsNum = Integer.parseInt(hexValue);

        int quotient = valueAsNum;
        int remainder;
        String result = "";

        do {
            remainder = quotient % BASE_SIXTEEN;
            result = HEX_TABLE.charAt(remainder) + result;
            quotient = quotient / BASE_SIXTEEN;

        } while (quotient != 0);

        return result;
    }
}
