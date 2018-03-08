package SimpleCalculations;

import java.util.Scanner;

public class P04_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firsName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        //Concatenate text and numbers as text:
        String concatenateData = firsName + lastName + age + town;

        System.out.println(concatenateData);
        //System.out.printf("You are %s %s, a %d-years old person from %s.", firsName, lastName, age, town);
    }
}
