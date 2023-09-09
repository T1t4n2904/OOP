import java.util.Scanner;

class Positive{
public static void main(String args[]){

	int a[],i=0,positive=0,negative=0,zero=0;
	a = new int[10];
	System.out.println("Enter 10 numbers : ");
	
	Scanner scan = new Scanner(System.in);
	
	for(i=0;i<10;i++){
	a[i] = scan.nextInt();
	}

	System.out.println("Your numbers : ");

	
	for(i=0;i<10;i++){
		if(a[i]>0){positive++;}
		if(a[i]<0){negative++;}
		if(a[i]==0){zero++;}
	}
	
	System.out.println("\nPositives = "+positive+"\nNegatives = "+negative+"\nZeroes = "+zero);

}}