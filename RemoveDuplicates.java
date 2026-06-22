public class RemoveDuplicates {
    public static int removeDuplicates(int arr[], int n) {
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;

                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
        int n = nums.length;

        int length = removeDuplicates(nums, n);

        System.out.println("New Length: " + length);

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
