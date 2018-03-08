import java.util.Scanner;

public class P03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        //We create variable of the boolean type:
        boolean isEven = num % 2 == 0;

        //We check if it is true or false:
        if (isEven) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
