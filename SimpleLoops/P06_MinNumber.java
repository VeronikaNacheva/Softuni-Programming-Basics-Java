import java.util.Scanner;

public class P06_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int smallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum < smallestNum) {
                smallestNum = currentNum;
            }
        }
        System.out.println(smallestNum);
    }
}
