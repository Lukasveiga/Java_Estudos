public class printFibonacci {

    private static long[] fibonacciCache;

    public static void main(String[] args) {

        int n = 6;

        fibonacciCache = new long[n + 1];

        for (int i =0; i <= n; i++) {

            System.out.print(fibonacci(i) + " ");
    }

        System.out.println();

        }

    private static long fibonacci(int n) {
        
        // Base case
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        // Apply memoization technique
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;
        return (fibonacci(n - 1) + fibonacci(n - 2));      
    }
}
