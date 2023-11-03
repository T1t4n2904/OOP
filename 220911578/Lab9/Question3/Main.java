import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        String reversedstring;
        String concatenatedString;
        String sortedString;

        System.out.println("Enter a string:");
        inputString = scanner.nextLine();

        System.out.println("1. Check Palindrome");
        System.out.println("2. Sort Alphabetically");
        System.out.println("3. Reverse String");
        System.out.println("4. Concatenate String");
        System.out.println("5. Exit");

        int choice;
        do {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline not consumed by nextInt()

            switch (choice) {
                case 1:
                    if (isPalindrome(inputString)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 2:
                    sortedString = sortAlphabetically(inputString);
                    System.out.println("The sorted string is: " + sortedString);
                    break;
                case 3:
                    reversedstring = reverseString(inputString);
                    System.out.println("The reversed string is: " + reversedstring);
                    break;
                case 4:
                    reversedstring = reverseString(inputString);
                    concatenatedString = concatenateString(inputString, reversedstring);
                    System.out.println("The concatenated string is: " + concatenatedString);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private static String sortAlphabetically(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String concatenateString(String str1, String str2) {
        return str1 + str2;
    }
}