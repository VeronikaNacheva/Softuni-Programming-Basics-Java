import java.util.Scanner;

public class P04_EvenPowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenPower = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(evenPower);
                evenPower *= 4;
            }
        }
    }
}
