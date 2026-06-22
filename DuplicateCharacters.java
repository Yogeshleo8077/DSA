import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void findDuplicates(String str) {

        // Used linkedhashmap because of insertion order could be maintained
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Store characters in hashmap
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        boolean isFound = false;

        // Loop over hashmap
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                isFound = true;
            }
        }

        // Is case any duplicate character would not found
        if (!isFound) {
            System.out.println("No duplicates characters found");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        findDuplicates(str);
        sc.close();
    }
}
