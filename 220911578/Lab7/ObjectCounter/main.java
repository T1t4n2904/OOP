
class Counter{

    static int count = 0;

    Counter(){
        count++;
    }

    static int getCount(){
        return count;
    }
}

public class main {
    public static void main(String args[]){
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        int count = Counter.getCount();
        System.out.println(count+" objects");

    }   
}
