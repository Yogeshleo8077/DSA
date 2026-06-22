import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingChar {
    public static char firstRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) > 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = firstRepeatingChar(str);

        if (result == '\0') {
            System.out.println("No reapeating character found");
        } else {
            System.out.println("First repeating character: " + result);
        }

        sc.close();
    }
}
