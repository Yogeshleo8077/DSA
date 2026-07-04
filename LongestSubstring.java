import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {
    public static int longestSubString(String str) {

        // Keep hashset for characters
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        // Loop over string
        for (int right = 0; right < str.length(); right++) {

            // Loop for removing characters from the left side of the string
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            // Count the max length of longest substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String str = sc.nextLine();

        int result = longestSubString(str);
        System.out.println("Length of the longest substring: " + result);

        sc.close();
    }
}
