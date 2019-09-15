package miscellaneous;

/**
 *
 * @author mary
 */
public class HurdleRace {
    
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
//        int[] height = {1, 6, 3, 5, 2};
        int[] height = {2, 5, 4, 5, 2};
        
        System.out.println(hurdleRace(7, height));
    }
    
    public static int hurdleRace(int k, int[] height) {
        
        int max = 0;
        
        for (int i : height) {
            if (i > max) {
                max = i;
            }
        }
        if (max > k) {
            return max - k;
        }
        return 0;
    }
}
