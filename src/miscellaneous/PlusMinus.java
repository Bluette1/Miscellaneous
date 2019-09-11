/**
 *
 * @author mary
 */
public class PlusMinus {
    
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, -1, -1};
        plusMinus(arr);
    }
    
    public static void plusMinus(int[] arr) {
        int total = arr.length;
        int negatives = 0;
        int positives = 0;
        int zeroes = 0;
        for (int i: arr) {
            if (i == 0) {
                zeroes++;
            }
            
            if (i < 0) {
                negatives++;
            }
            
            if (i > 0) {
                positives++;
            }
        }
        
        String zerosFrac = String.format("%.6f", (float) zeroes / total);
        String negFrac = String.format("%.6f", (float) negatives / total);
        String posFrac = String.format("%.6f", (float) positives / total);
       
        System.out.println(String.format("%.6f", (float) zeroes / total));
        System.out.println(String.format("%.6f", (float) negatives / total));
        System.out.println(String.format("%.6f", (float) positives / total));
    }
}
