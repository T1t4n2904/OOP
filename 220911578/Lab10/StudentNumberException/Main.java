import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's roll number: ");
        String rollNumber = scanner.nextLine();

        double marks1 = 0.0, marks2 = 0.0, marks3 = 0.0;

        try {
            System.out.print("Enter marks in subject 1: ");
            marks1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter marks in subject 2: ");
            marks2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter marks in subject 3: ");
            marks3 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric marks.");
            return;
        }

        double totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300) * 100;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
