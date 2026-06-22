public class PalinedromeString {
    public static boolean isPalinedrome(String str, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "maam";
        int n = str.length();

        System.out.println(isPalinedrome(str, n));
    }
}
