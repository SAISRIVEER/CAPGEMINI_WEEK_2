class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Checking Account");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    int durationMonths;
    FixedDepositAccount(String accountNumber, double balance, int durationMonths) {
        super(accountNumber, balance);
        this.durationMonths = durationMonths;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Duration: " + durationMonths + " months");
    }
}
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123", 100000, 4.5);
        CheckingAccount ca = new CheckingAccount("456", 55000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("789", 32000, 12);
        sa.displayAccountType();
        System.out.println("-----");
        ca.displayAccountType();
        System.out.println("-----");
        fda.displayAccountType();
    }
}
