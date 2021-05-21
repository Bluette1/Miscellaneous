package miscellaneous.dynamicprogramming;

/**
 * Given a list of N coins, their values (V1, V2, … , VN), and
 * the total sum S. Find the minimum number of coins the sum of 
 * which is S (we can use as many coins of one type as we want), 
 * or report that it’s not possible to select coins in such a way that they
 * sum up to S.
 */
public class MinimumCoins {
  // For each subproblem/state i, i <= S:
  //  - Initialise solution as Infinity is there's no already existing solution 
    //  - Identify coins j, where Vj <= i
          //  - Let solution(i - vj) be m
            //  - If (m + 1) < current solution for i, update it to (m + 1)
 
}
