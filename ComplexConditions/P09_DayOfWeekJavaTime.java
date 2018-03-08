import java.util.Scanner;

public class P09_DayOfWeekJavaTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 1:
                System.out.println(java.time.DayOfWeek.MONDAY);
                break;
            case 2:
                System.out.println(java.time.DayOfWeek.TUESDAY);
                break;
            case 3:
                System.out.println(java.time.DayOfWeek.WEDNESDAY);
                break;
            case 4:
                System.out.println(java.time.DayOfWeek.THURSDAY);
                break;
            case 5:
                System.out.println(java.time.DayOfWeek.FRIDAY);
                break;
            case 6:
                System.out.println(java.time.DayOfWeek.SATURDAY);
                break;
            case 7:
                System.out.println(java.time.DayOfWeek.SUNDAY);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
