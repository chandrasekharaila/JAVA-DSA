package DAY2;

public class LargestNumberArray {
    public static void main(String[] args) {
        int largestIndex = 0;
        int[] arr1 = { 10, 20, 330, 40, 50, 60 };
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr1[largestIndex]) {
                largestIndex = i;
            }
        }
        System.err.printf("The largest number in the array is at index %d and the number is %d", largestIndex,
                arr1[largestIndex]);
    }
}
