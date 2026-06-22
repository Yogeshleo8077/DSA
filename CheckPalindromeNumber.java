public class CheckPalindromeNumber {
    public static boolean checkPalindrome(int number) {

        int originalNumber = number;
        int reverse = 0;

        // reverse the number
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return originalNumber == reverse;
    }

    public static void main(String args[]) {
        int number = 121;
        System.out.println(checkPalindrome(number));

    }
}
