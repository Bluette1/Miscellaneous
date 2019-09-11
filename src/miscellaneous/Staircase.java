/**
 *
 * @author mary
 */
public class Staircase {
    
    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        staircase(4);
    }
    
    public static void staircase(int n) {
        int symbols = 1;
        int spaces = n - 1;
        while (symbols <= n) {
            System.out.println(getPic(" ", spaces) + getPic("#", symbols));
            symbols++;
            spaces--;
        }  
    }
    
    public static String getPic(String symbol, int n) {
        String pic = "";
  
        while (n > 0) {
            pic += symbol;
            n--;
        }
        return pic;
    }
}
