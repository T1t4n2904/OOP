import java.util.Scanner;

class Table{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int num,i,prod;
System.out.print("Enter number : ");
num = scan.nextInt();

for(i=1 ; i<=10 ; i++){System.out.println(num+" x "+i+" = "+num*i);}


}}