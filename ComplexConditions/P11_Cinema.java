import java.util.Scanner;

public class P11_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        int sum = row * column;
        double income = 0;

        switch (type) {
            case "Premiere":
                income = sum * 12.00;
                break;
            case "Normal":
                income = sum * 7.50;
                break;
            case "Discount":
                income = sum * 5.00;
                break;

        }
        System.out.printf("%.2f", income);
    }
}
