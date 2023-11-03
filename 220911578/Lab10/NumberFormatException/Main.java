import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number : ");
            String input = scanner.nextLine();

            // Attempt to parse the input as an integer
            int number = Integer.parseInt(input);

            System.out.println("You entered a valid number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
}
