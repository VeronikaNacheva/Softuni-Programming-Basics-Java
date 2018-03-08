import java.util.Scanner;

public class P10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());

        //Calculate degrees with formula:
        double radToDeg = rad * 180 / Math.PI;

        //Print the result rounded to the closest integer. We use Math.round():
        System.out.println(Math.round(radToDeg));
    }
}
