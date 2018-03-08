import java.util.Scanner;

public class P07_RectangleArea2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        //We use Math.abs to get a positive value
        double x = Math.abs(x1-x2);
        double y = Math.abs(y1-y2);

        //We calculate rectangle area and perimeter
        double rectangleArea = x * y;
        double rectanglePerimeter = (x + y) * 2;

        System.out.printf("%s%n%s", rectangleArea, rectanglePerimeter);
    }
}
