import java.util.*;

class Timeplus {
    double hrs;
    double min;
    double th;
    double tt;

    public void printHours() {
        th = (hrs + hrs);
        System.out.println("Hours =");
        System.out.println(this.hrs);
    }

    public void printMins() {
        tt = (min + min);
        System.out.println("Minutes =");
        System.out.println(this.min);
    }

    // public void printSecs() {
    // System.out.println("Seconds =");
    // }
}

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Hour");

        Timeplus h1 = new Timeplus();
        h1.hrs = 2.00;
        Timeplus h2 = new Timeplus();
        h2.hrs = 3.00;

        Timeplus m1 = new Timeplus();
        m1.min = 59;
        Timeplus m2 = new Timeplus();
        m2.min = 65;

        h1.printHours();
        h2.printHours();

        m1.printMins();
        m2.printMins();
    }
}
