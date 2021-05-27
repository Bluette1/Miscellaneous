package miscellaneous.dynamicprogramming;

/**
 * Given a list of N coins, their values (V1, V2, … , VN), and
 * the total sum S. Find the minimum number of coins the sum of 
 * which is S (we can use as many coins of one type as we want), 
 * or report that it’s not possible to select coins in such a way that they
 * sum up to S.
 */
public class MinimumCoins {
  public static void main( String args[] ) {
   int S = 11;
   int[] values = {1, 3, 5};
}
 public static int minimumCoins(int S, int[] values) {
   
    // For each subproblem/state i, i <= S:
  //  - Initialise solution for i > 0 as Infinity is there's no already
  //    existing solution. Solution for i = 0 is set to 0.
    //  - Identify coins j, where Vj <= i
          //  - Let solution(i - vj) be m
            //  - If (m + 1) < current solution for i, update it to (m + 1)
  var infinity = Integer.MAX_VALUE;
  int[] states = new int[S + 1];
  for (int i = 1; i < states.length; i += 1) {
    states[i] = infinity;
  }
  for (int i = 1; i < states.length; i += 1) {
    for (int j = 0; j < values.length; j += 1) {
      if (values[j] <= i) {
        int m = states[i - values[j]];
        if (m  == infinity) {
          states[i] = 1;
        } else if (m + 1 < states[i]) {
          states[i] = m + 1;
        }
      }
    }   
  }

  if (states[S] == infinity){
    return -1;
  }

  return states[S];
 }
}
