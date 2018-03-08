import java.util.Scanner;

public class P07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            String stars = repeatString("*", i);
            String spaces = repeatString(" ", n-i);

            String line = spaces + stars + " | " + stars + spaces;

            System.out.println(line);
        }
    }
    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <=count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
