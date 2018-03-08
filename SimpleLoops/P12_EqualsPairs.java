import java.util.Scanner;

public class P12_EqualsPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int value = 0;
        int lastValue = 0;
        int counter = 0;
        int maxDiff = 0;

        for (int i = 1; i <= n; i++) {
            int currentA = Integer.parseInt(scanner.nextLine());
            int currentB = Integer.parseInt(scanner.nextLine());

            value = currentA + currentB;

            if (value == lastValue) {
                counter++;
            }
            if (maxDiff < Math.abs(lastValue - value) && i >= 2) {
                maxDiff = Math.abs(lastValue - value);
            }
            if (value != lastValue) {
                lastValue = value;
            }
        }
        if (counter == n - 1) {
            System.out.println("Yes, value=" + value);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
