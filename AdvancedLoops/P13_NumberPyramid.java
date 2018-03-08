import java.util.Scanner;

public class P13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) System.out.print(" ");
                System.out.print(counter);
                counter++;

                if (counter > n) {
                    break;
                }
            }
            System.out.println();
            if (counter > n) {
                break;
            }
        }
    }
}
