/**
 * This program checks if a number is an Armstrong number.
 * An Armstrong number is one where the sum of its digits raised to the power of the number of digits equals the number itself.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	System.out.print("Enter number : ");
        int number = scan.nextInt(); 
        int ogNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        if (sum == ogNumber) {
            System.out.println(ogNumber + " is an Armstrong number.");
        } else {
            System.out.println(ogNumber + " is not an Armstrong number.");
        }
    }
}
