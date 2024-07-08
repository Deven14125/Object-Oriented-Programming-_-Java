public class Triangle4 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int k = 8; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                // System.out.print("* ");
                if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8 || j == 0 || j == 2 || j == 4 || j == 6 || j == 8) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" `!Asz2");
        }
    }
}
