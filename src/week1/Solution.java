package week1;

public class Solution {
    /**
     * Return nth Fibonacci number.
     *
     * @param n nth Fibonacci number
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        long f0 = 0;
        long f1 = 1;
        long fn = f0 + f1;
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }

        for (int i = 2; i <= n; ++i) {
            fn = f0 + f1;
            if (fn < 0) {
                return Long.MAX_VALUE;
            }
            f0 = f1;
            f1 = fn;
        }

        return fn;
    }
    public static void main(String[] args) {
        System.out.println("F(0) = " + Solution.fibonacci(0));
        System.out.println("F(1) = " + Solution.fibonacci(1));
        System.out.println("F(2) = " + Solution.fibonacci(2));
        System.out.println("F(10) = " + Solution.fibonacci(10));
        System.out.println("F(50) = " + Solution.fibonacci(50));
    }
}
