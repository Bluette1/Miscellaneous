
import java.util.Arrays;

/**
 *
 * @author marylene
 */
public class BinarySearch {

    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] searchArray = {1, 2, 3, 4, 5, 8, 12};
        Arrays.sort(searchArray);
        System.out.println(binarySearch(0, searchArray.length - 1, searchArray, 4));
    }

    public static int binarySearch(int first, int last, int[] searchArray, int key) {
        
        int index = -1;
        if (last < first) {
            return index;
        }

        int mid = (first + last + 1) / 2;

        if (searchArray[mid] == key) {
            return mid;
        }

        if (searchArray[mid] < key) {
            // search beyond this section
            return binarySearch(mid + 1, last, searchArray, key);
        } else {// search below this section
            return binarySearch(0, mid - 1, searchArray, key);
        }

    }

}
