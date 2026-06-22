import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void countVowelAndConsonant(String str) {

        // Keep count of vowels and consonant
        int vowelCount = 0;
        int consonantCount = 0;

        // Traverse string
        for (char ch : str.toCharArray()) {

            // Check whether a char is vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        countVowelAndConsonant(str);

        sc.close();
    }
}
