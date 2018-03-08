import java.util.Scanner;

public class P03_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        //Concatenate "Hello" with name, from the console and "!".
        String greeting = "Hello, " + name + '!';

        System.out.println(greeting);
    }
}