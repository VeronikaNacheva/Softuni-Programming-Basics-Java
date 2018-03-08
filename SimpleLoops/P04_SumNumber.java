import java.util.Scanner;

public class P04_SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        int sumNumbers = 0;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            sumNumbers += currentNum;
        }
        System.out.println(sumNumbers);
    }
}
