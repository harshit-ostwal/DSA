import java.util.Scanner;

public class Star_Pattern_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // nst Stands For No.Of.Stars in a row
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nst++;
            System.out.println();
        }
    }
}
