import java.util.Scanner;

public class P03_PowersOfTwoMathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= Math.pow(2, n); i*=2) {
            System.out.println(i);
        }
    }
}
