package DAY2;

public class LinearSearch {
    public static int LinSearch(String key, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] menu = { "Tomato", "banana", "mango" };
        int index = LinSearch("banana", menu);
        if (index == -1) {
            System.err.println("Product not found");
        } else {
            System.err.printf("product found at index : %d", index);
        }
    }
}
