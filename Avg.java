import java.util.*;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int sum = 0;
        float avg = 0;
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Enter a value of =" + i);
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("");
        avg = (float) sum / n;
        System.out.println("Average =" + avg);

    }
}
