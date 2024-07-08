import java.util.*;

class circle {
    double radius;
    double area;

    public void printRadius() {
        System.out.println("Radius=");
        System.out.println(this.radius);
    }

    public void printArea() {
        area = (Math.PI * radius * radius);
        System.out.println("Area =");
        System.out.println(this.area);
    }
}

public class CircleClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        circle r1 = new circle();
        r1.radius = 10;

        circle r2 = new circle();
        r2.radius = 20;

        r1.printArea();
        r2.printArea();

        // r1.printRadius();
        // r2.printRadius();

    }
}
