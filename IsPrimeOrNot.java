import java.util.Scanner;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n % 2 == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
