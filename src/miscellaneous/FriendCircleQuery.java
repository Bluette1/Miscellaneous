package miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author marylene
 */
public class FriendCircleQuery {

    /**
     * The main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       int[][] queries= {{1, 2}, {3, 4}, {2, 3}};
//         int[][] queries= {{1, 2}, {3, 4}, {1, 3}, {5, 7}, {5, 6}, {7, 4}};
//            int[][] queries= {
//                {1, 2}, {3, 4}, {1, 3}, {5, 7}, {5, 6}, {8, 9}, {6, 10}, {11, 9}, {12, 5}, {6, 1}, {9, 13},
//                {22, 23}, {24, 21}, {22, 24}, {22, 9}, {50, 51}, {54, 51}, {50, 22},
//                {33, 34}, {35, 36}, {34, 36}, {33, 4}, {13, 99}, {100, 13}, {36, 76}
//            };
        int[][] queries = {{6, 4}, {5, 9}, {8, 5}, {4, 1}, {1, 5}, {7, 2}, {4, 2}, {7, 6}};
//        int[][] queries = {{1000000000, 23}, {11, 3778}, {7, 47}, {11, 1000000000}};

        int[] result = friendCircleQuery(queries);
        System.out.println(Arrays.toString(result));
    }

    static int[] friendCircleQuery(int[][] queries) {
        int length = queries.length;
        int[] resultArray = new int[length];
        List<List<Integer>> store = new ArrayList();
        int max = 0;
        for (int i = 0; i < length; i++) {
            int count = 0;
            List<Integer> updateRow = new ArrayList();
            int firstFriend = queries[i][0];
            int secondFriend = queries[i][1];
            int rowIndexFirst = contains(store, firstFriend, i - 1);
            int rowIndexSecond = contains(store, secondFriend, i - 1);
            if (rowIndexFirst != -1 && rowIndexSecond != rowIndexFirst) {
                //add this whole list
                List row = store.get(rowIndexFirst);
                count += row.size();
                updateRow.addAll(row);

            } else {// just add the one friend
                count++;
                updateRow.add(firstFriend);

            }

            if (rowIndexSecond != -1 && rowIndexSecond != rowIndexFirst) {
                //add this whole list
                List row = store.get(rowIndexSecond);
                count += row.size();
                updateRow.addAll(row);
//                    
            } else {// just add the one friend
                count++;
                updateRow.add(secondFriend);

            }

            if (max < count) {
                resultArray[i] = count;
                max = count;
            } else {
                resultArray[i] = max;
            }

            store.add(updateRow); // update store
            System.out.println(i + ": " + store.get(i));
        }

        return resultArray;
    }

    static int contains(List<List<Integer>> store, int friend, int lastRow) {
        int index = -1;
        for (int i = lastRow; i >= 0; i--) {
            List<Integer> row = store.get(i);
            if (row.contains(friend)) {
                return i;
            }
        }
        return index;
    }

}
