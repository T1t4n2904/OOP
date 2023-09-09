import java.util.Scanner;

class Palindrome{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int num,n=0,rem=0,rat;
System.out.println("Enter number : ");
num=scan.nextInt();
rat = num;
while(rat!=0){
rem = rat%10;
n = n*10 + rem;
rat = rat/10;
}
if(n==num){
System.out.println("Is a palindrome");}
else {System.out.println("Not a palindrome");}
}
}