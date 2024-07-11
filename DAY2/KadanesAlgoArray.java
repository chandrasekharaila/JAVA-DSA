package DAY2;

public class KadanesAlgoArray {
    public static void KadAlgo(int[] arr) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        int tempIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs > ms) {
                ms = cs;
                startIndex = tempIndex;
                endIndex = i;
            }

            if (cs < 0) {
                cs = 0;
                tempIndex = i + 1;
            }
        }
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, -20, 50, 40, 1 };
        KadAlgo(arr);
    }
}
