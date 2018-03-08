import java.util.Scanner;

public class P01_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        //Check if gender is "f":
        if (gender.equals("f")) {
            //Gender is "f", then check if age is lower to 16:
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }

        } else {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        }
    }
}
