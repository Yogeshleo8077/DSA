public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int arr[]) {

        // Check array is empty or not
        if (arr.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3 };

        int k = removeDuplicates(nums);

        System.out.println("Unique Elements: " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}
