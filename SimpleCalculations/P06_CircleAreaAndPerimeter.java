import java.util.Scanner;

public class P06_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        //We use Math.PI in class Math
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("Area = %s %n Perimeter = %s", area, perimeter);
    }
}
