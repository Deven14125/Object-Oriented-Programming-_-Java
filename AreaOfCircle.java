import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner Area = new Scanner(System.in);

        float r;
        System.out.println("Enter radius");
        r = Area.nextFloat();
        System.out.println("Area=" + (3.14 * r * r));
    }
}
