import java.util.Scanner;

public class P09_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int sumVowels = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            switch (letter){
                case 'a':
                    sumVowels += 1;
                    break;
                case 'e':
                    sumVowels += 2;
                    break;
                case 'i':
                    sumVowels += 3;
                    break;
                case 'o':
                    sumVowels += 4;
                    break;
                case 'u':
                    sumVowels += 5;
                    break;
            }
        }
        System.out.println(sumVowels);
    }
}
