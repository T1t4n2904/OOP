import java.util.Scanner;

class Student_Detail {
    String name;
    String ID;
    String college_name;

    void display_details() {
        System.out.println("\nName : " + name+"\nID : "+ID+"\nCollege : "+college_name);
    }
}

class p{
    static void print(String words){
        System.out.print(words);
    }
}


public class Main {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);

        p.print("No of students : ");
        int size = scan.nextInt();
        scan.nextLine();
        Student_Detail[] record = new Student_Detail[size];

        for(int i = 0; i<size; i++){
            record[i] = new Student_Detail();
            
            p.print("Name : "); 
            record[i].name =  scan.nextLine();
            p.print("ID : ");
            record[i].ID = scan.nextLine();
            p.print("College : ");
            record[i].college_name = scan.nextLine();
        }

        for(int i=0; i<size; i++){
            record[i].display_details();
        }

    }
}