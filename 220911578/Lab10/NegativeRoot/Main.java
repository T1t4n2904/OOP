import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number >= 0) {
            double sqrt = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + sqrt);
        } else {
            System.out.println("Cannot calculate the square root of a negative number.");
        }
    }
}
