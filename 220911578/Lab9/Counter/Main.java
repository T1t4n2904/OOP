import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        int characterCount = string.length();
        int wordCount = 1;
        int lineCount = 1;
        int vowelCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (character == ' ') {
                wordCount++;
            } else if (character == '\n') {
                lineCount++;
            } else if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
}