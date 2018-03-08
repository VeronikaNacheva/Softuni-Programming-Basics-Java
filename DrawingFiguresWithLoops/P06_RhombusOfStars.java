import java.util.Scanner;

public class P06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int stars = 1;
        for (int i = 1; i < n; i++) {
            String line = repeatString(" ", n - i) + repeatString("* ", stars);
            System.out.println(line);
            stars++;
        }

        for (int j = 1; j <= n; j++) {
            String line = repeatString(" ", j - 1) + repeatString("* ", stars);
            System.out.println(line);
            stars--;
        }
    }

    static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 1; i <= count; i++) {
            text = text + toRepeat;
        }
        return text;
    }
}
