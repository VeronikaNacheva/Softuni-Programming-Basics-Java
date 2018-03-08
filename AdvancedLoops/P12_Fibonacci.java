import java.util.Scanner;

public class P12_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int fZero = 1;
        int fOne = 1;
        int counter = 0;
        while (counter < n - 1) {
            int nextF = fZero + fOne;
            fZero = fOne;
            fOne = nextF;
            counter++;
        }
        System.out.println(fOne);
    }
}
