import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Length of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Enter a Value of Array =" + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Reverse Order");
        for (i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
