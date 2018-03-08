import java.util.Scanner;

public class P08_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //We calculate triangle area by formula.
        double triangleArea = a * h / 2;

        //Print the result with exactly two digits after the decimal point
        System.out.printf("%.2f", triangleArea);
    }
}