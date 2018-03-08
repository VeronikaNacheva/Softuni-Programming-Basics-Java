import java.util.Scanner;

public class P01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        //We check if the grade from the console is greater or equal to 5.50
        //If it is greater or equal we print:
        if (grade >= 5.5) {
            System.out.println("Excellent!");
        }
    }
}
