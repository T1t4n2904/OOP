import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a five-letter word:");
        String word = scanner.nextLine();

        if (word.length() != 5) {
            System.out.println("Please enter a five-letter word.");
            System.exit(0);
        }

        String[] threeLetterWords = generateThreeLetterWords(word);

        System.out.println("The three letter words that can be derived from the letters of the five letter word are:");
        for (String threeLetterWord : threeLetterWords) {
            System.out.println(threeLetterWord);
        }
    }

    public static String[] generateThreeLetterWords(String word) {
        String[] threeLetterWords = new String[20];
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                for (int k = j + 1; k < word.length(); k++) {
                    threeLetterWords[count++] = word.substring(i, i + 1) + word.substring(j, j + 1) + word.substring(k, k + 1);
                }
            }
        }

        return threeLetterWords;
    }
}