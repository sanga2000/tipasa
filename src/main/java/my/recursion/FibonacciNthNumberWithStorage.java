package my.recursion;

/**
 * Created by sangamesh on 5/27/17.
 */
public class FibonacciNthNumberWithStorage {

    public static void main(String[] args) {
        FibonacciNthNumberWithStorage fib = new FibonacciNthNumberWithStorage();

        for (int i = 0; i< 6; i++){
            fib.fibonacci(i, new int[i+1]);
        }
    }

    private int fibonacci(int n, int[] storage) {
        System.out.println(n);
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (storage[n] > 0)
            return storage[n];


        storage[n] = fibonacci(n - 1, storage) + fibonacci(n - 2, storage);

        return storage[n];
    }

}
