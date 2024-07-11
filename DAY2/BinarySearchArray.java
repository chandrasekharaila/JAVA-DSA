package DAY2;

public class BinarySearchArray {
    public static int BinSearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int key = 8;
        int index = BinSearch(arr1, key);
        if (index == -1) {
            System.out.printf("No key present in the array");
        } else {
            System.out.printf("The key is found at index : %d", index);
        }
    }
}
