
class StudentRecord{
    int regNo;
    String name;
    int age;

    StudentRecord(int regNo, String name, int age){
        this.regNo = regNo;
        this.name = name;
        this.age = age;
    }
}

class UGstudent extends StudentRecord{
    int semester;
    double fees;

    UGstudent(int regNo, String name, int age, int semester, double fees){
        super(regNo, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void display() {
        System.out.println("\nName: "+name+"\nRegNo : "+regNo+"\nAge : "+age+"\nSemester : "+semester+"\nFees : Rs. "+fees);
    }

}

class PGstudent extends StudentRecord{
    int semester;
    double fees;

    PGstudent(int regNo, String name, int age, int semester, double fees){
        super(regNo, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void display() {
        System.out.println("\nName: "+name+"\nRegNo : "+regNo+"\nAge : "+age+"\nSemester : "+semester+"\nFees : Rs. "+fees);
    }
}

public class Main{
    public static void main(String args[]){
        PGstudent pg = new PGstudent(220911578, "Aditya", 19, 3, 500000);
        UGstudent ug = new UGstudent(220911145, "Raj", 23, 2, 300000);

        pg.display();
        ug.display();
    }
}



