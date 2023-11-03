class Type{
    static void test(int num){
        System.out.println(num+" is an integer");
    }
}

public class main {
    public static void main(String args[]){
        Integer num = 20; //autoboxing
        Type.test(num); //unboxing
    }   
}
