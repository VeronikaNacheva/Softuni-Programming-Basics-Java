import java.util.Scanner;

public class P14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutesPlus15 = ((hour * 60) + minutes) + 15;
        int hourPlus = allMinutesPlus15 / 60;
        int minutesPlus = allMinutesPlus15 % 60;

        if (hourPlus >= 24) {
            hourPlus = hourPlus - 24;
        }

        System.out.printf("%d:%02d", hourPlus, minutesPlus);
    }
}
