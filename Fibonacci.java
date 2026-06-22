public class Fibonacci {
    public static int getNthFibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("n must be non-negative");

        if (n == 0 || n == 1)
            return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(getNthFibonacci(n));
    }
}