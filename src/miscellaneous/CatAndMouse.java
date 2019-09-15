package miscellaneous;

/**
 *
 * @author mary
 */
public class CatAndMouse {
    
    /**
     * The main method
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }
    
    public static String catAndMouse(int x, int y, int z) {
        String winner = "";
        
        // check the various distances
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);
        
        if (catA == catB) {
            winner = "Mouse C";
        } else if (catA < catB) {
            winner = "Cat A";
        } else {
            winner = "Cat B";
        }
        return winner;     
    } 
}
