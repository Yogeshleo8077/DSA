import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingCharacterHashSet {
    public static char firstRepeatingChar(String str) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }

            set.add(ch);
        }

        return '\0';

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = firstRepeatingChar(str);

        if (result == '\0') {
            System.out.println("No repeating character found");
        } else {
            System.out.println("First repeating charcter: " + result);
        }

        sc.close();
    }
}
