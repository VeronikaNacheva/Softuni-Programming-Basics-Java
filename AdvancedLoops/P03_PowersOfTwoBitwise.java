import java.util.Scanner;

public class P03_PowersOfTwoBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(1);
        for (int i = 1; i <= n; i++) {
            System.out.println(1 << i);
        }
    }
}
