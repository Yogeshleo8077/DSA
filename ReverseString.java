import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0; // left pointer
        int right = arr.length - 1; // right pointer

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++; // Increment by 1
            right--; // Decrement by 1
        }

        System.out.println("Reversed String: " + new String(arr));

        sc.close();

    }
}
