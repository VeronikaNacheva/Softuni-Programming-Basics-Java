package SimpleCalculations;

import java.util.Scanner;

public class P12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String inputCurrency = scanner.nextLine();
        String outputCurrency = scanner.nextLine();

        //We compare two String with method equals
        if ("USD".equals(inputCurrency)) {
            sum = sum * 1.79549;
        } else if ("EUR".equals(inputCurrency)) {
            sum = sum * 1.95583;
        } else if ("GBP".equals(inputCurrency)) {
            sum = sum * 2.53405;
        }

        if ("USD".equals(outputCurrency)) {
            sum = sum / 1.79549;
        } else if ("EUR".equals(outputCurrency)) {
            sum = sum / 1.95583;
        } else if ("GBP".equals(outputCurrency)) {
            sum = sum / 2.53405;
        }

        System.out.printf("%.2f %s", sum, outputCurrency);

    }
}
