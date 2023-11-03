
class Account {
    String name;
    String accNo;
    String accountType;
    double balance;

    Account(String name, String accNo, String accountType) {
        this.name = name;
        this.accNo = accNo;
        this.accountType = accountType;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs. " + amount + " successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void displayBalance(){
        System.out.println("Name       : "+name+"\nAccount No : "+accNo+"\nBalance    : "+balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs. " + amount + " successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String name, String accNo){
        super(name, accNo, "Current");
    }
}

class SavingsAccount extends Account {
    double minBalance = 500;
    double rate = 2;
    double serviceTax = 50;
    
    SavingsAccount(String name, String accNo){
        super(name, accNo, "Savings");
    }

    public void computeInterest(){
        double interest = (balance*rate)/100;
        deposit(interest);
    }

    public void checkMinimumBalance() {
        if(balance <= minBalance) {
            balance -= serviceTax;
            System.out.println("Rs. "+serviceTax+" deducted due to insufficient minumum balance");
        }
    }
}

public class Main{
    public static void main(String args[]){
        SavingsAccount savingsAcc = new SavingsAccount("Aditya", "AEF200978");
        CurrentAccount currentAcc = new CurrentAccount("Rohan", "GDC212008");

        savingsAcc.deposit(100);
        savingsAcc.computeInterest();
        savingsAcc.checkMinimumBalance();
        savingsAcc.displayBalance();

        currentAcc.deposit(200);
        currentAcc.displayBalance();
    }
}