package DAY2;

public class ReverseArray {
    public static int[] RevArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start = start + 1;
            end = end - 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        arr = RevArr(arr);
        for (int x : arr) {
            System.out.printf("%d ", x);
        }
    }
}
