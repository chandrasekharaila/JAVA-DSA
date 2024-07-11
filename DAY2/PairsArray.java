package DAY2;

public class PairsArray {
    public static void printPairs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.printf("[%d %d] ", arr[i], arr[j]);
                count++;
            }
            System.out.println();
        }
        System.out.printf("Total pairs : %d", count);
        // total pairs formula (n*(n-1))/2
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printPairs(arr1);
    }
}
