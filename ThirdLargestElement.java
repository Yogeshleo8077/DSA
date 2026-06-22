
public class ThirdLargestElement {
    public static int thirdLargestElement(int arr[]) {
        if (arr.length < 3) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != first && num != second) {
                third = num;
            }
        }

        return third;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 8, 75, 698, 53, 4 };
        System.out.println(thirdLargestElement(arr));
    }
}
