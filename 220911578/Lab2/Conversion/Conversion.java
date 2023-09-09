import java.util.Scanner;

class Conversions{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int number: ");
        int numInt = scan.nextInt();
        System.out.print("Enter a double number: ");
        double numDouble = scan.nextDouble();
        System.out.print("Enter a char: ");
        char charValue = scan.next().charAt(0);
        
        byte byteFromInt = (byte) numInt;
        int intFromChar = (int) charValue;
        byte byteFromDouble = (byte) numDouble;
        int intFromDouble = (int) numDouble;
        
        System.out.println("Int to Byte: " + byteFromInt);
        System.out.println("Char to Int: " + intFromChar);
        System.out.println("Double to Byte: " + byteFromDouble);
        System.out.println("Double to Int: " + intFromDouble);
    }
}