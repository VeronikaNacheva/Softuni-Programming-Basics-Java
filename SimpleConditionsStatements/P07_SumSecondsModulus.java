import java.util.Scanner;

public class P07_SumSecondsModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int athlete1 = Integer.parseInt(scanner.nextLine());
        int athlete2 = Integer.parseInt(scanner.nextLine());
        int athlete3 = Integer.parseInt(scanner.nextLine());

        int allTime = athlete1+athlete2+athlete3; //For example allTime == 113

        int min = allTime / 60; //For example min == 1
        int sec = allTime % 60; //For example sec == 53

        //Print result with leading zero if it is one digits:
        System.out.printf("%d:%02d", min, sec);
    }
}
