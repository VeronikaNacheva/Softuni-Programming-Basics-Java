import java.util.Scanner;

public class P01_SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read a floating point number from the console
        int a = Integer.parseInt(scanner.nextLine());

        //Calculate square area
        double squareArea = a * a;

        //Print the result (square area)
        System.out.println(squareArea);
    }
}