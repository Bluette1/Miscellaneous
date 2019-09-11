/**
 *
 * @author mary
 */
public class VeryBigSum {
    static long veryBigSum ( long[] arrBigNum) {
        long sum = 0;
        for (long i:arrBigNum) {
            sum += i;
        }
        return sum;
    }
}
