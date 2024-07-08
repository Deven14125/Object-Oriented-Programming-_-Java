import java.util.*;

public class Pattern71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String st = sc.nextLine();

        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(st.charAt(j));
            }
            System.out.println();
        }
    }
}