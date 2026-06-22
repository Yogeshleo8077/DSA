import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class MissingNumberMoreOne {
    public static List<Integer> missingNumbers(int arr[], int n) {
        HashSet<Integer> present = new HashSet<>();

        for (int num : arr) {
            present.add(num);
        }

        List<Integer> missing = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!present.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6 };
        int n = 6;
        System.out.println(missingNumbers(arr, n));
    }
}
