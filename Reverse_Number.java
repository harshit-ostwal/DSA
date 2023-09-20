import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i < n; i++) {
            int last = n % 10;
            System.out.print(last);
            n = n / 10;
        }
    }
}