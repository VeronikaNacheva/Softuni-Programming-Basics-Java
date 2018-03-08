import java.util.Scanner;

public class P08_TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sell = Double.parseDouble(scanner.nextLine());

        boolean firstSell = sell >= 0 && sell <= 500;
        boolean secondSell = sell > 500 && sell <= 1000;
        boolean thirdSell = sell > 1000 && sell <= 10000;
        boolean fourthSell = sell > 10000;

        double comission = 0;

        if ("Sofia".equals(town) && firstSell) {
            comission = sell * 0.05;
        } else if ("Sofia".equals(town) && secondSell) {
            comission = sell * 0.07;
        } else if ("Sofia".equals(town) && thirdSell) {
            comission = sell * 0.08;
        } else if ("Sofia".equals(town) && fourthSell) {
            comission = sell * 0.12;
        }

        if ("Varna".equals(town) && firstSell) {
            comission = sell * 0.045;
        } else if ("Varna".equals(town) && secondSell) {
            comission = sell * 0.075;
        } else if ("Varna".equals(town) && thirdSell) {
            comission = sell * 0.10;
        } else if ("Varna".equals(town) && fourthSell) {
            comission = sell * 0.13;
        }

        if ("Plovdiv".equals(town) && firstSell) {
            comission = sell * 0.055;
        } else if ("Plovdiv".equals(town) && secondSell) {
            comission = sell * 0.08;
        } else if ("Plovdiv".equals(town) && thirdSell) {
            comission = sell * 0.12;
        } else if ("Plovdiv".equals(town) && fourthSell) {
            comission = sell * 0.145;
        }

        if ((!firstSell && !secondSell && !thirdSell && !fourthSell) ||
                (!"Sofia".equals(town) &&
                        !"Varna".equals(town) &&
                        !"Plovdiv".equals(town))) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", comission);
        }
    }
}
