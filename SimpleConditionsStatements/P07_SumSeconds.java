import java.util.Scanner;

public class P07_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int athlete1 = Integer.parseInt(scanner.nextLine());
        int athlete2 = Integer.parseInt(scanner.nextLine());
        int athlete3 = Integer.parseInt(scanner.nextLine());

        int sum = athlete1 + athlete2 + athlete3;
        int minutes = 0;
        int seconds = 0;

        if (sum<=59) {
            seconds=sum;
        } else if (sum<=119 ) {
            minutes=sum/60;
            seconds=sum%60;
        } else if (sum<=179) {
            minutes=sum/60;
            seconds=sum%60;
        }

        if (seconds<10) {
            System.out.printf("%s:0%s", minutes, seconds);
        } else {
            System.out.printf("%s:%s", minutes, seconds);
        }

    }
}
