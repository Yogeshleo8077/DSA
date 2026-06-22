public class Factorial {
    public static int getNthFactorail(int n) {
        if (n == 0)
            throw new IllegalArgumentException("n must be greater than 0");

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(getNthFactorail(n));
    }
}
