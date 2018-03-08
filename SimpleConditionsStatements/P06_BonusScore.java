import java.util.Scanner;

public class P06_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (score <= 100) {
            bonus += 5;
        } else if (score < 1000) {
            bonus += score * 0.2;
        } else {
            bonus += score * 0.1;
        }

        if (score % 2 == 0){
            bonus += 1;
        }else if (score % 5 == 0) {
            bonus += 2;
        }

        System.out.printf("%f%n%f", bonus, bonus + score);
    }
}