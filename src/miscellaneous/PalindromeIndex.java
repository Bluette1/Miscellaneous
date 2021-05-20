public class PalindromeIndex {
  public static void main(String[] args) {
    // int res = palindromeIndex("awa");  
    // int res = palindromeIndex("bcbc");
    // int res = palindromeIndex("aaab");
    // int res = palindromeIndex("baa");
    int res = palindromeIndex("aaa");
    System.out.println(res);
  }
  /**
   * The 'reverseString' function
   * 
   * @param str
   * @return - the reversed string
   */
  public static String reverseString(String str){
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    return sb.toString();
  }

  /*
    * Complete the 'palindromeIndex' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts STRING s as parameter.
    */

  public static int palindromeIndex(String string) {
    int j = string.length() - 1;
    String reversedString = reverseString(string);
    if (string.equals(reversedString)) {
      return -1;
    }

    for (int i = 0; i <= j; i += 1) {
      String str = string.substring(0, i) + string.substring(i + 1, j + 1);
      String reversedStr = reversedString.substring(0, j - i) + reversedString.substring(j - i + 1, j + 1);

      if (str.equals(reversedStr)) {
        return i;
      }
    }
    return -1;
  }
  }
      