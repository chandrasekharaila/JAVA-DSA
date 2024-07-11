package DAY2;

public class SmallestNumberArray {
    public static void main(String[] args) {
        int[] arr1 = { 10111, 22120, 3212120, 4120, 51212120, 60313, 701313, 813130, 90, 11111 };
        int smallestIndex = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr1[smallestIndex]) {
                smallestIndex = i;
            }
        }
        System.out.printf("The smallest number is found at index %d and the number is %d", smallestIndex,
                arr1[smallestIndex]);
    }
}
