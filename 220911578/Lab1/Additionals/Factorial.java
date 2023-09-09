import java.util.Scanner;

class Factorial{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int num; System.out.print("Enter number : "); num = scan.nextInt();

int i,fact = 1;
for(i=1;i<=num;i++){
fact = fact*i;}

System.out.println(num+"! = "+fact);






}}