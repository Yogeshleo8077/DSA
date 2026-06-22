public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10; // getting last digit of number
            reverse = reverse * 10 + lastDigit;
            num = num / 10; // remove last digti from the number
        }

        return reverse;
    }

    public static void main(String args[]) {
        int num = 1234;
        System.out.println(reverseNumber(num));
    }
}
