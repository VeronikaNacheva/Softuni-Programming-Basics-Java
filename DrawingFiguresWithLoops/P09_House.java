import java.util.Scanner;

public class P09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n % 2 == 0) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                String line = repeatString("-", ((n / 2) - 1) - i)
                        + repeatString("**", i + 1)
                        + repeatString("-", ((n / 2) - 1) - i);
                System.out.println(line);
            }
        } else {
            for (int i = 0; i < (n + 1) / 2; i++) {
                String line = repeatString("-", (n / 2) - i)
                        + repeatString("*", 1 + (i * 2))
                        + repeatString("-", (n / 2) - i);
                System.out.println(line);
            }
        }
        for (int i = 0; i < n / 2; i++) {
            String line = "|"
                    + repeatString("*", (n - 2))
                    + "|";
            System.out.println(line);
        }
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}