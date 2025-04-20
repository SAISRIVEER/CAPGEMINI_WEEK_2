class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
    void showBalance() {
        System.out.println("Balance: $" + getBalance());
    }
}
class BankSystem {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.accountNumber = "7456811090";
        account.accountHolder = "Vishal Umasankar";
        account.setBalance(2450040.85);

        account.display();
        account.showBalance();
    }
}
