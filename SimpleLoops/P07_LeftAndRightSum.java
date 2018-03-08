import java.util.Scanner;

public class P07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= 2 * n; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            if (i <= n) {
                leftSum += current;
            } else {
                rightSum += current;
            }
        }

        int diff = Math.abs(leftSum-rightSum);
        if (diff == 0) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + diff);
        }
    }
}
