abstract class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited "+amount+". New balance: "+balance);
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("wihdraw amount: "+amount+"\nbalance: "+balance);
        }
    }
    public abstract double calculateInterest();

}

interface Lonable{
    void applyLoan(double loanAmount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance()*0.05;
    }
}

class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}

class LoanSavingsAccount extends SavingsAccount implements Lonable{
    public LoanSavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyLoan(double loanAmount) {
        System.out.println("Loan for "+loanAmount+" is applied for "+getHolderName());

    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance()*10;
    }
}

class BankSystem{
    public static void main(String[] args) {
        BankAccount savings=new SavingsAccount("1234A","Alice",20000);
        BankAccount current=new CurrentAccount("4321B","Bob",41000);
        LoanSavingsAccount loanSavings= new LoanSavingsAccount("5647C","Jhon",12000);

        processAccounts(new BankAccount[]{savings,current,loanSavings});

        loanSavings.applyLoan(5000);
        System.out.println("Loan eligibility for "+loanSavings.getHolderName()+": "+loanSavings.calculateLoanEligibility());
    }

    public static void processAccounts(BankAccount[] accounts) {
        for(BankAccount account:accounts){
            System.out.println("\nHolder name: "+account.getHolderName());
            System.out.println("Account number: "+account.getAccountNumber());
            System.out.println("Balance: "+account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());
        }
    }
}
