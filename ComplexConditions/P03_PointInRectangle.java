import java.util.Scanner;

public class P03_PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());

        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean rightLeft = x >= x1 && x <= x2;
        boolean downUp = y >= y1 && y <= y2;

        if (rightLeft && downUp) {
            System.out.println("Inside");
        } else{
            System.out.println("Outside");
        }
    }
}
