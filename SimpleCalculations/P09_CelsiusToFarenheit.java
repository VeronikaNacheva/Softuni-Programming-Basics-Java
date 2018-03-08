package SimpleCalculations;

import java.util.Scanner;

public class P09_CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = celsius * 1.8 + 32;

        //Print the result with exactly two digits after the decimal point
        System.out.printf("%.2f", fahrenheit);
    }
}