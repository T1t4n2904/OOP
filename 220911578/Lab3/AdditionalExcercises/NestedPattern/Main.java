/**
 * This program displays a number pattern using nested for loops.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter number of rows");
        int rows = scan.nextInt();
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
		num++;
            }
            System.out.println();
        }
    }
}
