package DAY1;

import java.util.*;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        sc.close();
        System.out.printf("The number you have entered is %d\n", integer);
        System.out.printf("The number you have entered is %s", line);
    }
}
