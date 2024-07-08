import java.util.*;

public class Percentage {
    public static void main(String[] args) {
        Scanner Percentage = new Scanner(System.in);

        System.out.println("Enter Total Mark");
        int totalmark = Percentage.nextInt();

        System.out.println("Enter Mark1");
        int m1 = Percentage.nextInt();
        while (m1 > totalmark || m1 < 0) {
            System.out.println("Enter Mark1 Again");
            m1 = Percentage.nextInt();
        }

        System.out.println("Enter Mark2");
        int m2 = Percentage.nextInt();
        while (m2 > totalmark || m2 < 0) {
            System.out.println("Enter Mark2 Again");
            m2 = Percentage.nextInt();
        }

        System.out.println("Enter Mark3");
        int m3 = Percentage.nextInt();
        while (m3 > totalmark || m3 < 0) {
            System.out.println("Enter Mark3 Again");
            m3 = Percentage.nextInt();
        }

        System.out.println("Enter Mark4");
        int m4 = Percentage.nextInt();
        while (m4 > totalmark || m4 < 0) {
            System.out.println("Enter Mark4 Again");
            m4 = Percentage.nextInt();
        }

        System.out.println("Enter Mark5");
        int m5 = Percentage.nextInt();
        while (m5 > totalmark || m5 < 0) {
            System.out.println("Enter Mark5 Again");
            m5 = Percentage.nextInt();
        }

        double Per = ((m1 + m2 + m3 + m4 + m5) / totalmark * 100) / 5.0;

        if (Per >= 60) {
            System.out.println("First Class");
        } else if (Per > 50) {
            System.out.println("Second Class");
        } else if (Per > 40) {
            System.out.println("Third Class");
        } else if (Per < 40) {
            System.out.println("You are Failed");
        }
    }
}