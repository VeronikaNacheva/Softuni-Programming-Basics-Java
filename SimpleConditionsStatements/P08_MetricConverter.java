import java.util.Scanner;

public class P08_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("mm")) {
            num /= 1000;
        } else if (input.equals("cm")) {
            num /= 100;
        } else if (input.equals("mi")) {
            num /= 0.000621371192;
        } else if (input.equals("in")) {
            num /= 39.3700787;
        } else if (input.equals("km")) {
            num /= 0.001;
        } else if (input.equals("ft")) {
            num /= 3.2808399;
        } else if (input.equals("yd")) {
            num /= 1.0936133;
        }

        if (output.equals("mm")) {
            num *= 1000;
        } else if (output.equals("cm")) {
            num *= 100;
        } else if (output.equals("mi")) {
            num *= 0.000621371192;
        } else if (output.equals("in")) {
            num *= 39.3700787;
        } else if (output.equals("km")) {
            num *= 0.001;
        } else if (output.equals("ft")) {
            num *= 3.2808399;
        } else if (output.equals("yd")) {
            num *= 1.0936133;
        }

        System.out.printf("%f %s", num, output);
    }
}
