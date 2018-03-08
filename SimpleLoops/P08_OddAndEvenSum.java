import java.util.Scanner;

public class P08_OddAndEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            if (i%2==0) {
                sumEven += current;
            } else {
                sumOdd += current;
            }
        }

        int diff = Math.abs(sumEven-sumOdd);
        if (diff == 0) {
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}
