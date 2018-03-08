import java.util.Scanner;

public class P05_SquareFrames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.print("+ ");
        for (int dashes = 1; dashes <= n - 2; dashes++) {
            System.out.print("- ");
        }
        System.out.println("+");

        for (int row = 1; row <= n - 2; row++) {
            System.out.print("| ");
            for (int dashes = 1; dashes <= n - 2; dashes++) {
                System.out.print("- ");
            }
            System.out.println("|");
        }
        System.out.print("+ ");

        for (int dashes = 1; dashes <= n - 2; dashes++) {
            System.out.print("- ");
        }
        System.out.println("+");
    }
}
