package miscellaneous;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ServiceLane {

    // Complete the serviceLane function below.
    static int[] serviceLane(int n, int[] width,int[][] cases) {

        int[] minWidths = new int[n];
        System.out.println("n:::" + n);
//        for(int i = 0; i < cases.length; i++) {
//            System.out.println("test cases::::::::" + Arrays.toString(cases[i]));
//        }
        
         for(int i = 0; i < cases.length; i++) {
            int startIndex = cases[i][0];
            int endIndex = cases[i][1];
            
            // Initialise minimum width
            int minWidth = -1;
            // Iterate through this segment (startIndex - endIndex) of widths array to find the min width
            
            for (int j = startIndex; j <= endIndex; j++) {
                if (width[j] < minWidth || minWidth == -1) {
                    minWidth = width[j];
                }
                
            minWidths[i] = minWidth;
            }
            
            return minWidths;
            
        }
        
        System.out.println("width::::::::::::::" + Arrays.toString(width));

        return minWidths;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nt = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nt[0]);

        int t = Integer.parseInt(nt[1]);

        int[] width = new int[n];

        String[] widthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthItems[i]);
            width[i] = widthItem;
        }

        int[][] cases = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] casesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowItems[j]);
                cases[i][j] = casesItem;
            }
        }

        int[] result = serviceLane(n, width, cases);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
