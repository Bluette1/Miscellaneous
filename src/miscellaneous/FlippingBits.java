package miscellaneous;

/**
 *
 * @author marylene
 */
public class FlippingBits {

    /**
     * The main method
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long decimal = 1;
        long result = decimalConvert(
            convertToUnsigedTwosComplement(binaryConvert(decimal, ""))
        );
        
//        System.out.println(decimalConvert("1001"));
//        
//        System.out.println("Binary: " + binaryConvert(9, ""));
//        System.out.println(convertToUnsigedTwosComplement(binaryConvert(9, "")));
        
        System.out.println("Result is: " + result);
//        System.out.println(decimalConvert("1001"));
    }
    
     /**
     * This will return the a binary string representation of a given decimal
     * number. This is a recursive method; the initial arguments passed are the decimal
     * to be converted and an empty string.
     *
     * @param decimal a decimal number
     * @param binaryStr  a string
     * @return binaryStr binary string representation of the decimal
     *         number.
     */
    public static String binaryConvert(long decimal, String binaryStr) {
        if (decimal == 0) {
            return binaryStr;
        } else {
            return binaryConvert(decimal / 2, decimal % 2 + binaryStr);
        }
    }
     
    public static String convertToUnsigedTwosComplement (String binaryStr) {
        String twosComplement = "";
        // append zeros in front of binary string to make up 32 bit string
        int zerosToAdd = 32 - binaryStr.length();
        String append = "";
        while (zerosToAdd > 0) {
            append += "0";
            zerosToAdd--;
        }
        String unSignedStr = append + binaryStr;
        System.out.println("unSignedStr: " + unSignedStr);
        
        // Flip bits
        int i = 0;
        while (i < 32) {
            if (unSignedStr.charAt(i) == '0') {
                twosComplement += "1";
            } else {
                twosComplement += "0";
            }
            i++;
        
        }
        
        System.out.println("twosComplement: " + twosComplement);
        return twosComplement;
    }
    
    public static long decimalConvert (String twosComplement) {
        long decimal = 0;
        int i = twosComplement.length() - 1;
        
        int j = 0;
        while (i >= 0) {
            System.out.println("Math.pow(2, i): " + Math.pow(2, i));
            System.out.println("Character.getNumericValue(twosComplement.charAt(i)): " + i + ": " + Character.getNumericValue(twosComplement.charAt(i)));
            decimal += Character.getNumericValue(twosComplement.charAt(j)) * Math.pow(2, i);
            i--;
            j++;
        }
        return decimal;
    
    }
    
}
