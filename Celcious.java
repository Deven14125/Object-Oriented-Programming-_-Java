import java.util.*;

public class Celcious {
    public static void main(String[] args) {
        Scanner Celcious = new Scanner(System.in);

        float F;
        System.out.println("Enter Fahrenhit");
        F = Celcious.nextInt();
        System.out.println("Celcious=" + ((F - 32) * 5) / 9);
    }
}
