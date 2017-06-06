package my.recursion;

/**
 * Created by sangamesh on 5/27/17.
 */
public class FibonacciOfNthNumber {
    public static void main(String[] args) {
        FibonacciOfNthNumber fib = new FibonacciOfNthNumber();
        System.out.println("final output " + fib.fibonacci(4));
    }


    //O(2^n)
    private int fibonacci (int n ) {
        if (n ==0)
            return 0;
        if (n == 1)
            return 1;
        System.out.println(n);
         return fibonacci(n-1) + fibonacci(n-2);
    }
}
