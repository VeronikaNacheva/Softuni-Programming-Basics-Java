import java.util.Scanner;

public class P16_Number0to100toText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int firstNum = num / 10;
        int secondNum = num % 10;
        int bothNum = num;

        String secondWord = "";
        String firstWord = "";
        String bothWord = "";

        if (secondNum == 0) {
            secondWord = "zero";
        } else if (secondNum == 1) {
            secondWord = "one";
        } else if (secondNum == 2) {
            secondWord = "two";
        } else if (secondNum == 3) {
            secondWord = "three";
        } else if (secondNum == 4) {
            secondWord = "four";
        } else if (secondNum == 5) {
            secondWord = "five";
        } else if (secondNum == 6) {
            secondWord = "six";
        } else if (secondNum == 7) {
            secondWord = "seven";
        } else if (secondNum == 8) {
            secondWord = "eight";
        } else if (secondNum == 9) {
            secondWord = "nine";
        }

        if (firstNum == 2) {
            firstWord = "twenty";
        } else if (firstNum == 3) {
            firstWord = "thirty";
        } else if (firstNum == 4) {
            firstWord = "forty";
        } else if (firstNum == 5) {
            firstWord = "fifty";
        } else if (firstNum == 6) {
            firstWord = "sixty";
        } else if (firstNum == 7) {
            firstWord = "seventy";
        } else if (firstNum == 8) {
            firstWord = "eighty";
        } else if (firstNum == 9) {
            firstWord = "ninety";
        }

        if (bothNum == 10) {
            bothWord = "ten";
        } else if (bothNum == 11) {
            bothWord = "eleven";
        } else if (bothNum == 12) {
            bothWord = "twelve";
        } else if (bothNum == 13) {
            bothWord = "thirteen";
        } else if (bothNum == 14) {
            bothWord = "fourteen";
        } else if (bothNum == 15) {
            bothWord = "fifteen";
        } else if (bothNum == 16) {
            bothWord = "sixteen";
        } else if (bothNum == 17) {
            bothWord = "seventeen";
        } else if (bothNum == 18) {
            bothWord = "eighteen";
        } else if (bothNum == 19) {
            bothWord = "nineteen";
        }

        if (num >= 0 && num <= 9) {
            System.out.println(secondWord);
        } else if (num >= 10 && num <= 19) {
            System.out.println(bothWord);
        } else if (num >= 20 && num <= 100) {
            if (num % 10 == 0 && num != 10 && num != 100){
                System.out.println(firstWord);
            } else if (num == 100) {
                System.out.println("one hundred");
            } else {
                System.out.println(firstWord + " " + secondWord);
            }
        } else {
            System.out.println("invalid number");
        }
    }
}