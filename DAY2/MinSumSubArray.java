package DAY2;

public class MinSumSubArray {
    public static void MinSum(int arr[]) {
        int minsum = arr[0];
        int arrsum = 0;
        int startindex = 0;
        int endindex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    arrsum = arrsum + arr[k];
                }

                if (minsum > arrsum) {
                    startindex = i;
                    endindex = j;
                    minsum = arrsum;
                }
                arrsum = 0;
            }
        }
        System.out.printf("Minimum sum of sub array is %d\n", minsum);
        for (int i = startindex; i <= endindex; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, -2, 3, 4, -5, 6, 7 };
        MinSum(arr);
    }
}
