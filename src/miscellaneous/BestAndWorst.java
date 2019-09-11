package miscellaneous;

/**
 *
 * @author mary
 */
public class BestAndWorst {
    
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
    
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] res = breakingRecords(scores); 
        System.out.println(res[0] + " " + res[1]);
    }
    
    public static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores[0];
        int countMax = 0;
        int countMin = 0;
        
        for (int i: scores) {
            if (i > max) {
                countMax++;
                max = i;
            }
            
            if (i < min) {
                countMin++;
                min = i;
            }
        
        }
        
        int[] count = {countMax, countMin};
        
        return count;
    }
}
