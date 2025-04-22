public class BankAccount {

    long accountNumber;
    double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails(){
        System.out.println("\nAccount Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType(){
        super.displayDetails();
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Account type: Savings Account");
    }
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;

    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }


    void displayAccountType(){
        super.displayDetails();
        System.out.println("Withdrawal Limit: "+withdrawalLimit);
        System.out.println("Account type: Checking Account");
    }

}

class Bank{
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount(4521378937894L,20000,4.5);
        CheckingAccount c=new CheckingAccount(456123789456L,40000,5000);

        s.displayAccountType();
        c.displayAccountType();
    }
}