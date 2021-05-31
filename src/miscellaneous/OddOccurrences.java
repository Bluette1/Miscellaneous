package miscellaneous;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * The OddOccurrencesInArray class. This is a solution for the
 * OddOccurrencesInArray task.
 *
 * @author marylene
 * @see https://app.codility.com/demo/results/trainingSVNJG7-4M4/
 * @since 12 August 2018
 */
public class OddOccurrencesInArray {
    
    /**
     * This will search the elements in a given array to find the unpaired.
     * element. The passed array will always have an odd number of elements. All
     * of the elements in the array except one occur an even number of times.
     *
     * @param array an array
     * @return the unpaired element
     */
    public static int findUnpaired(int[] array) {
      List<Integer> count = new ArrayList<>();
      for (int i = 0; i < array.length; i += 1) {
        if(count.contains(array[i])) {
          count.remove((Integer) array[i]);
        } else {
          count.add(array[i]);
        }
      }
      return count.get(0);
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items in the array (should be an"
            + " odd number):");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the items in the array (each except one item "
            + "must occur an even number of times):");
        int count = 0;
        while (count < n) { 
            array[count] = input.nextInt();
            count++;
        }
        System.out.println("The element without a duplicate is: "
            + findUnpaired(array));
    }
}