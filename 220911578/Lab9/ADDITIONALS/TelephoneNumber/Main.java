import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the telephone number:");
        String phoneNumber = scanner.nextLine();

        // Remove all non-digit characters
        String cleanedPhoneNumber = phoneNumber.replaceAll("\\D", "");

        // Extract area code, first three digits, and last four digits
        String areaCode = cleanedPhoneNumber.substring(0, 3);
        String firstThreeDigits = cleanedPhoneNumber.substring(3, 6);
        String lastFourDigits = cleanedPhoneNumber.substring(6, 10);

        System.out.println("Area Code: " + areaCode);
        System.out.println("Seven Digit Phone Number: " + firstThreeDigits + "-" + lastFourDigits);
    }
}