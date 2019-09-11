package miscellaneous;

/**
 *
 * @author mary
 */
public class BirthdayCake {
    
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 3};
        birthdayCakeCandles(arr);
    }
    
    public static void birthdayCakeCandles(int[] arr) {
        // iterate through array looking for max   
        int max = 0;
        
        int count = 0;
        
        for (int i : arr) {
            if (i == max) {
            
            count++;
            }
            
           if (i > max) {
               max = i;
               // reinitialise count
               count = 1;
           }
        }     
        System.out.println(count);   
    }
 }
