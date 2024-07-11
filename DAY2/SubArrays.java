package DAY2;

public class SubArrays {
    public static void SbArr(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\n", arr[i]);
            count++;
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.printf("%d ", arr[k]);
                }
                count++;
                System.out.println();
            }
        }
        System.out.printf("Total subarrays is %d", count);
    }

    // formula for number of sub arrays is (n*(n+1))/2
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        SbArr(arr);
    }
}
