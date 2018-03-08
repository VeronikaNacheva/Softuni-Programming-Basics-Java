import java.util.Scanner;

public class P12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeYear = scanner.nextLine();
        int holiday = Integer.parseInt(scanner.nextLine());
        int weekends = Integer.parseInt(scanner.nextLine());

        double weeksSofia = 48 - weekends;
        double weekPlaySofia = weeksSofia * 3.0 / 4;
        double holidayPlay = holiday * 2.0 / 3;

        double allGame = weekPlaySofia + holidayPlay + weekends;

        if ("leap".equals(typeYear)) {
            allGame += allGame * 0.15;
        }
        System.out.printf("%.0f", Math.floor(allGame));
    }
}
