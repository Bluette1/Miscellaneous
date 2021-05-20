public class PalindromeIndex {
  public static void main(String[] args) {
    int res = palindromeIndex("awa");     
    System.out.println(res);
  }

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
      int i = 0;
      int j = string.length() - 1;
      String reversedString = reverseString(string);
      if (string == reversedString) {
        return -1;
      }

      for (i = 0; i <= j; i += 1) {
        String str = string.substring(0, i) + string.substring(i + 1);
        String reversedStr = reversedString.substring(0, j - i) + reversedString.substring(j - i + 1);
        if (str == reversedStr) {
          return i;
        }
      }
      return -1;
    }
  }
      