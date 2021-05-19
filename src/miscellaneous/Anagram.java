public class Anagram {
	public static void main(String[] args)  {
		anagram("abccde");
	}

	public static int countChar(String str, char character) {
		int count = (int)str.chars().filter(ch -> ch == character).count();
		return count;
	}

	/*
	 * Complete the 'anagram' function below.
	 *
	 * @see https://www.hackerrank.com/contests/microverse-coding-challenges/challenges/anagram
	 */

	public static int anagram(String str) {
		int len = str.length();
		int mid = len / 2;
		String firstPart = str.substring(0, mid);
		String secondPart = str.substring(mid, len);
		int resCount = 0;
		for(int idx = 0; idx < mid; idx += 1) {
			resCount += Math.abs(countChar(firstPart, firstPart.charAt(idx)) - countChar(secondPart, firstPart.charAt(idx)));
		}  
		System.out.println("resCount: " + resCount);

		return resCount;
		}
}
