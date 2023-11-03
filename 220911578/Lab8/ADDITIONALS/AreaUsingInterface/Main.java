import java.util.Scanner;
interface Area{
    void disparea(double area);

}
class Triangle {
    double tarea;
    public void disparea(double tar)
    {
        System.out.println("Area of the triangle "+tar);
    }
    double Tri(double b,double h)
    {
        tarea = b*h*1/2;
        return tarea;
    }
}
class Sqaure {
    double sarea;
    double Squ(double side)
    {
        sarea = side*side;
        return sarea;
    }
    public void disparea(double sar)
    {
        System.out.println("Area of the square "+sar);
    }
}
class additionalmaintwo{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter dimensions of the triangle (b and h):");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Enter side of the square ");
        double side = sc.nextDouble();
       Triangle t = new Triangle();
        double tarea=t.Tri(b, h);
        t.disparea(tarea);
        Sqaure s =new Sqaure();
        double sarea = s.Squ(side);
        s.disparea(sarea);
    }
}