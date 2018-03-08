import java.util.Scanner;

public class P10_HalfSumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            sum += current;

            if (current > biggest) {
                biggest = current;
            }
        }

        int sumOtherNums = sum - biggest;
        if (sumOtherNums == biggest) {
            System.out.printf("Yes%nSum = %d", biggest);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(biggest - sumOtherNums));
        }
    }
}
