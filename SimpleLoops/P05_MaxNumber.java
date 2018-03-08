import java.util.Scanner;

public class P05_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int biggestNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum > biggestNum) {
                biggestNum = currentNum;
            }
        }
        System.out.println(biggestNum);
    }
}