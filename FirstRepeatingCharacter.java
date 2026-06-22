import java.util.HashSet;

public class FirstRepeatingCharacter {
    public static char firstRepearingChar(String str) {
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
        String str = "hleloe";
        System.out.println(firstRepearingChar(str));
    }
}
