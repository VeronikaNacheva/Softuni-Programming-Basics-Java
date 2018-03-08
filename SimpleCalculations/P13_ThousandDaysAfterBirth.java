import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P13_ThousandDaysAfterBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String birthDay = scanner.nextLine();

        //With class DateTimeFormatter we set a pattern for the date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        //We are making Sting we read from the console on a date with pattern
        //Adding 999 days
        LocalDate after1000d = LocalDate.parse(birthDay, dateTimeFormatter).plusDays(999);

        //Print the result with the pattern we have set:
        System.out.println(dateTimeFormatter.format(after1000d));

    }
}
