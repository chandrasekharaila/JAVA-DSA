package DAY2;

public class MaxSubArray {

    public static void MaxSub(int[] arr) {
        int startIndex = 0;
        int endIndex = 0;
        int arrsum = 0;
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int start = i; start <= j; start++) {
                    System.out.print(arr[start] + " ");
                    arrsum += arr[start];
                }
                if (arrsum > maxsum) {
                    maxsum = arrsum;
                    startIndex = i;
                    endIndex = j;
                }
                arrsum = 0;
                System.out.println();
            }
        }
        System.out.println(" The max sum sub array is : ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.printf("the sum of sub array is %d", maxsum);
    }

    public static void main(String[] args) {
        int[] arr1 = { 15, -20, -1, -2, -3 };
        MaxSub(arr1);
    }
}