package miscellaneous;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author mary
 */
public class BonAppetit {
    
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer[] arr = {3, 10, 2, 9};
        List<Integer> bill = Arrays.asList(arr);
    
        bonAppetit(bill, 1, 12);
    }
    
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        
        for (int i = 0; i < bill.size(); i++) {
            if (i == k) {
                continue;
            }
            
            sum += bill.get(i);
        }
        
        int total = sum / 2;
        
        if (b == total) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - total);
        }
    }
}
