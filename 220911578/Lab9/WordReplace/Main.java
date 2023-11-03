import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a text: ");
        String input = scanner.nextLine();
        
        System.out.println("Enter the word to replace with repeated characters: ");
        String wordToReplace = scanner.nextLine();
        
        // Create a regular expression to match repeated characters
        String regex = "(?i)(\\w)\\1+";
        
        // Replace all occurrences of repeated characters with the word to replace
        String result = input.replaceAll(regex, wordToReplace);
        
        System.out.println("Result: " + result);
    }
}
