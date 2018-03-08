package SimpleCalculations;

import java.util.Scanner;

public class P02_InchToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());

        double cmToInch = inch * 2.54;

        System.out.println(cmToInch);
    }
}
