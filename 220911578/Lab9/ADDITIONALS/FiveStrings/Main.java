import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        System.out.println("Enter the third string:");
        String thirdString = scanner.nextLine();

        System.out.println("Enter the fourth string:");
        String fourthString = scanner.nextLine();

        System.out.println("Enter the fifth string:");
        String fifthString = scanner.nextLine();

        String concatenatedString = firstString + secondString + thirdString + fourthString + fifthString;
        System.out.println("The concatenated string is: " + concatenatedString);
    }
}