import java.util.Scanner;

abstract class Area {
    String shape;

    void displayArea(double area) {
        System.out.println("Area of " + shape + " is " + area);
    }
}

class Rectangle extends Area {
    double rarea;

    double calculateRectangleArea(double l, double b) {
        rarea = l * b;
        shape = "rectangle";
        return rarea;
    }
}

class Circle extends Area {
    double carea;

    double calculateCircleArea(double r) {
        carea = r * r * 22.0 / 7.0;
        shape = "circle";
        return carea;
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions of the rectangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter radius of the circle: ");
        double ra = sc.nextDouble();

        Rectangle r = new Rectangle();
        double rarea = r.calculateRectangleArea(l, b);
        r.displayArea(rarea);

        Circle c = new Circle();
        double carea = c.calculateCircleArea(ra);
        c.displayArea(carea);
    }
}
