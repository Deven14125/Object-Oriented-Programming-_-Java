import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        Scanner Maximum = new Scanner(System.in);

        System.out.println("Enter X1");
        int X1 = Maximum.nextInt();

        System.out.println("Enter X2");
        int X2 = Maximum.nextInt();

        System.out.println("Enter X3");
        int X3 = Maximum.nextInt();

        if (X1 > X2) {
            if (X1 > X3) {
                System.out.println("X1 is Maximum");
            }
        } else if (X2 > X3) {
            System.out.println("X2 is Maximum");
        } else {
            System.out.println("X3 is Maximum");
        }
    }
}
