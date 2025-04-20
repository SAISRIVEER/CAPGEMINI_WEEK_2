interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double income);
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public abstract double calculateInterest();
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + holderName + ", Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public double calculateInterest() {
        return 0;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
class LoanAccount extends BankAccount implements Loanable {
    public LoanAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    @Override
    public double calculateInterest() {
        return getBalance() * 0.05;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of $" + amount + " applied.");
    }
    @Override
    public boolean calculateLoanEligibility(double income) {
        return income > 5000;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("123", "Vishal", 1000000, 3),
                new CurrentAccount("456", "Hinata", 150000, 2000),
                new LoanAccount("789", "Kageyama", 500000)
        };

        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            double interest = account.calculateInterest();
            System.out.println("Interest: $" + interest);
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(1000);
                boolean eligible = loanAccount.calculateLoanEligibility(6000);
                System.out.println("Loan Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
            }
            System.out.println("----------------------------");
        }
    }
}
