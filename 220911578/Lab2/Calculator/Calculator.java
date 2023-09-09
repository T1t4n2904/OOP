import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scan.next().charAt(0);
            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();
            
            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
            
            System.out.println("Result: " + result);
            
            System.out.print("Do another calculation? (y/n): ");
            choice = scan.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
