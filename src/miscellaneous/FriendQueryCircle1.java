package miscellaneous;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;

public class FriendQueryCircle1 {

    // Complete the maxCircle function below.
    static int[] maxCircle(int[][] queries) {
        int length = queries.length;
        int[] resultArray = new int[length];
        List<List<Integer>> store = new ArrayList();
        int max = 0;
        for (int i = 0; i < length; i++) {

            List<Integer> updateRow = new ArrayList();
            int firstFriend = queries[i][0];
            int secondFriend = queries[i][1];
            int rowIndexFirst = contains(store, firstFriend);
            int rowIndexSecond = contains(store, secondFriend);
            boolean removeRowIndexFirst = false;
            boolean removeRowIndexSecond = false;
            if (rowIndexSecond >= 0 &&  rowIndexSecond == rowIndexFirst) {

            } else {

                if (rowIndexFirst != -1) {
                    //add this whole list
                    List row = store.get(rowIndexFirst);
                    updateRow.addAll(row);
                    removeRowIndexFirst = true;

                } else {// just add the one friend
                    updateRow.add(firstFriend);

                }

                if (rowIndexSecond != -1) {
                    //add this whole list
                    List row = store.get(rowIndexSecond);

                    updateRow.addAll(row);
                    removeRowIndexSecond = true;

                } else {// just add the one friend

                    updateRow.add(secondFriend);

                }

            }

            if (removeRowIndexFirst) {
                store.remove(rowIndexFirst); //remove this list
            }

            if (removeRowIndexSecond) {
                if (removeRowIndexFirst && rowIndexFirst < rowIndexSecond) {
                    rowIndexSecond--;
                }
                store.remove(rowIndexSecond); //remove this list
            }
            int size = updateRow.size();
            if (max < size) {
                resultArray[i] = size;
                max = size;
            } else {
                resultArray[i] = max;
            }
            if (!updateRow.isEmpty()) {
                store.add(updateRow); // update store
            }
            // System.out.println(i + ": " + store.get(i));
            System.out.println(i + "::::: " + updateRow);
        }

        return resultArray;

    }

    static int contains(List<List<Integer>> store, int friend) {
        int index = -1;
        for (int i = store.size() - 1; i >= 0; i--) {
            List<Integer> row = store.get(i);
            if (row.contains(friend)) {
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int[][] queries = null;

        try {
            File file = new File("testcase4friendcirclequery.txt");
            Scanner scanner = new Scanner(file);

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            queries = new int[q][2];

            for (int i = 0; i < q; i++) {
                String[] queriesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int queriesItem = Integer.parseInt(queriesRowItems[j]);
                    queries[i][j] = queriesItem;
                }

            }

            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FriendQueryCircle1.class.getName()).log(Level.SEVERE, null, ex);
        }

        int[] ans = maxCircle(queries);

        for (int i = 0; i < ans.length; i++) {
            bufferedWriter.write(String.valueOf(ans[i]));

            if (i != ans.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

    }
}
