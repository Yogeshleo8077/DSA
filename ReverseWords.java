import java.util.Scanner;

public class ReverseWords {
    public static String reverseString(String str) {

        // Keep a string builder for the result
        StringBuilder sb = new StringBuilder();

        // Convert and split string into String array
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {

            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        // Convert into string before returning
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(reverseString(str));

        sc.close();

    }
}
