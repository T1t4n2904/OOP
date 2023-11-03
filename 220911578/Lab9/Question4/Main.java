import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;
        int choice;

        System.out.println("Enter the first string:");
        str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        str2 = scanner.nextLine();

        do {
            System.out.println("\n1. Compare two strings");
            System.out.println("2. Convert case");
            System.out.println("3. Check substring");
            System.out.println("4. Replace substring");
            System.out.println("5. Exit");

            System.out.println("\nEnter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (str1.equals(str2)) {
                        System.out.println("Both strings are equal.");
                    } else {
                        System.out.println("Both strings are not equal.");
                    }
                    break;

                case 2:
                    System.out.println("Entered string: " + str1);
                    System.out.println("Converted string: " + convertCase(str1));
                    break;

                case 3:
                    if (str1.contains(str2) || str2.contains(str1)) {
                        System.out.println("One string is a substring of the other.");
                    } else {
                        System.out.println("Neither string is a substring of the other.");
                    }
                    break;

                case 4:
                    if (str1.contains(str2)) {
                        str1 = str1.replace(str2, "<substring>");
                        System.out.println("Modified string: " + str1);
                    } else if (str2.contains(str1)) {
                        str2 = str2.replace(str1, "<substring>");
                        System.out.println("Modified string: " + str2);
                    } else {
                        System.out.println("Neither string is a substring of the other.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public static String convertCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }

        return result.toString();
    }
}