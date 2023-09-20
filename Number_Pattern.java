import java.util.Scanner;

public class Number_Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 1;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(count + " ");
                count++;
            }
            num++;
            System.out.println();
        }
    }
}
