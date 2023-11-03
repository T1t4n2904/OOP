1import java.util.Scanner;
interface Area{
    void disparea(double area);

}
class Rectangle {
    double rarea;
    public void disparea(double rar)
    {
        System.out.println("Area of the rectangle "+rar);
    }
    double Rect(double l,double b)
    {
        rarea = l*b;
        return rarea;
    }
}
class Circle {
    double carea;
    double cir(double r)
    {
        carea = r*r*22/7;
        return carea;
    }
    public void disparea(double rar)
    {
        System.out.println("Area of the circle "+rar);
    }
}
class Areamaintwo{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter dimensions of the rectangle (l and b):");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter radius of the circle ");
        double ra = sc.nextDouble();
        Rectangle r = new Rectangle();
        double rarea=r.Rect(l, b);
        r.disparea(rarea);
        Circle c =new Circle();
        double carea = c.cir(ra);
        c.disparea(carea);
    }
}