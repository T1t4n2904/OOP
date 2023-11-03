class Bike{
    int speedlimit = 80;

    void run(){
        System.out.println("Speedlimit of a common bike : "+speedlimit);
    }
}

class Splendar extends Bike{
    int speedlimit = 120;

    void run(){
        System.out.println("Speedlimit of Splendar : "+speedlimit);
    }
}

public class Main {
    public static void main(String[] args) {
        Bike commonBike = new Bike();
        Bike splendar = new Splendar();
        
        commonBike.run();
        splendar.run();
    }
}
