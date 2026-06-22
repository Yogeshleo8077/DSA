import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static char FirstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String str = "Hello world";

        System.out.println(FirstNonRepeatingChar(str));
    }
}
