import java.util.Scanner;

public class P05_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean isValid = num >= 100 && num <= 200 || num == 0;

        if (!isValid) {
            System.out.println("invalid");
        }
    }
}
