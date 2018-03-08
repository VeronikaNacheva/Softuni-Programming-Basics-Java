import java.util.Scanner;

public class P13_PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        boolean insideOne = x > 0 && x < 3 * h && y > 0 && y < h;
        boolean insideTwo = x > h && x < 2 * h && y >= h && y < 4 * h;
        boolean outsideOne = x < 0 || x > 3 * h || y < 0 || y > h;
        boolean outsideTwo = x < h || x > 2 * h || y < h || y > 4 * h;

        if (outsideOne && outsideTwo) {
            System.out.println("outside");
        } else if (insideOne || insideTwo) {
            System.out.println("inside");
        }else{
            System.out.println("border");
        }
    }
}