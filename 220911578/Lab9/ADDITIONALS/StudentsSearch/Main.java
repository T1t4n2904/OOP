
import java.util.Arrays;
import java.util.Scanner;

class Student {
    int registrationNumber;
    String firstName;
    String lastName;
    String degree;

    public Student(int registrationNumber, String firstName, String lastName, String degree) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "\nRegistration Number: " + registrationNumber + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nDegree: " + degree;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(1, "Aditya", "Kadam", "B.Tech"),
                new Student(2, "Vasu", "zgoel", "B.Sc"),
                
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name or Last Name to search:");
        String searchKey = scanner.nextLine();

        boolean isFound = false;
        for (Student student : students) {
            if (student.firstName.equalsIgnoreCase(searchKey) || student.lastName.equalsIgnoreCase(searchKey)) {
                System.out.println(student);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("No student found with the provided First Name or Last Name.");
        }
    }
}