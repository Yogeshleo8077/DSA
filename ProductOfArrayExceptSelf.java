public class ProductOfArrayExceptSelf {

    // Brute Force Method
    // Time Complexity - O(n^2)
    // Space Complexity - O(n)
    public static int[] productExceptItSelf(int arr[]) {

        // Keep array for product array
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int product = 1;

            for (int j = 0; j < arr.length; j++) {

                // Skip itself element
                if (i != j) {
                    product *= arr[j];
                }
            }

            result[i] = product;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        int result[] = productExceptItSelf(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
