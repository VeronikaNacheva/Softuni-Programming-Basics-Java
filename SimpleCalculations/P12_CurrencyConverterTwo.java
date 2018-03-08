package SimpleCalculations;

import java.util.Scanner;

public class P12_CurrencyConverterTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        //We use switch - case:
        switch (input) {
            case "USD":
                sum = sum * 1.79549;
                break;
            case "EUR":
                sum = sum * 1.95583;
                break;
            case "GBP":
                sum = sum * 2.53405;
                break;
        }

        switch (output) {
            case "USD":
                sum = sum / 1.79549;
                break;
            case "EUR":
                sum = sum / 1.95583;
                break;
            case "GBP":
                sum = sum / 2.53405;
                break;
        }

        System.out.printf("%.2f %s", sum, output);

    }
}
