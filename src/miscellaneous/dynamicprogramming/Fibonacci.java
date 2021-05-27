package miscellaneous.dynamicprogramming;

public class Fibonacci {

  public static void main(String[] args) {
    for(int i = 0; i < 10; i += 1) {
      // System.out.println(fibonacci(i));
      // System.out.println(dynamicFibonacci(i));  
    }
    // int N = 10;
    int N = 100;
    System.out.println(evenFibonacci(N)); 
  }

  public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
  } 

  public static int dynamicFibonacci(int n) {
    int prev = 1;
    int curr = 1;

    if (n == 0 || n == 1) {
      return 1;
    }

    int i = 2;

    while(i <= n) {
      int temp = prev;
      prev = curr;
      curr = temp + curr;
      i += 1;
    }
    return curr;
  }

  public static int evenFibonacci(int N) {
    int sum = 0;
    int fib = 1;
    int prev = 1;
    
    while (fib <= N) {
      if (fib % 2 == 0)  {
        sum += fib;
      }
        int temp = prev;
        prev = fib;
        fib = temp + fib;
    }
    return sum;
  }
}
