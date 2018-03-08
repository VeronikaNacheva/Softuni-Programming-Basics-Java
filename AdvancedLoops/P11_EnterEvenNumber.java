import java.util.Scanner;

public class P11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter even number: ");

        int n = Integer.parseInt(scanner.nextLine());

        while (true) {
            if (n % 2 == 0) {
                System.out.println("Even number entered: " + n);
                break;
            }
            System.out.println("The number is not even.");
            System.out.print("Enter even number: ");
            n = Integer.parseInt(scanner.nextLine());
        }
    }
}
