import java.util.Scanner;
abstract class Area{
    void disparea(double area){
        System.out.println("Area is "+area);
    }

}
class Square extends Area{
    double sarea;
    double Squ(double s)
    {
        sarea = s*s;
        return sarea;
    }
}
class Triangle extends Area{
    double tarea;
    double Tri(double b,double h)
    {
        tarea = b*h*1/2;
        return tarea;
    }
}
class Main{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter dimensions of the Triangle (b and h):");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Enter edge of the Square ");
        double side = sc.nextDouble();
        Triangle t = new Triangle();
        double tarea=t.Tri(b, h);
        t.disparea(tarea);
        Square s =new Square();
        double sarea = s.Squ(side);
        s.disparea(sarea);
    }
}