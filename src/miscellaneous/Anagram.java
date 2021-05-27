import java.util.List;
import java.util.ArrayList;

public class Anagram {
	public static void main(String[] args)  {
		anagram("abccde");
		anagram("aaabbb");
		anagram("abc");
		anagram("xaxbbbxx");
	}
  
	/**
	 * The 'countChar' function
	 * 
	 * @param str
	 * @param character
	 * @return count - the number of occurrences of a given character in a string
	 */
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
		if (len % 2 != 0) {
			return -1;
		}
		int mid = len / 2;
		String firstPart = str.substring(0, mid);
		String secondPart = str.substring(mid, len);
		List <Character> counted = new ArrayList<Character>();
		List <Integer> counts = new ArrayList<Integer>();
		int resCount = 0;
		for(int idx = 0; idx < mid; idx += 1) {
			char curr = firstPart.charAt(idx);
			if (!(counted.contains(curr))) {
			int diff = countChar(firstPart, curr) - countChar(secondPart, curr);
			if (diff >= 0) {
				counts.add(diff);
			} else if(counts.indexOf(Math.abs(diff)) >= 0) {
				counts.set(counts.indexOf(Math.abs(diff)), Math.abs(diff));
			}				
				counted.add(curr);
			}
		
		}  
		for(int idx = 0; idx < counts.size(); idx += 1) {
			resCount += counts.get(idx);
		}
		return resCount;
		}
}
