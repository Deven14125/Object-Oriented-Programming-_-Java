import java.util.*;

public class StringLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        String str = sc.nextLine();

        int n = str.length();
        System.out.println("Length =" + n);
        System.out.println("Second Half =" + str.substring((n / 2)));
    }
}
