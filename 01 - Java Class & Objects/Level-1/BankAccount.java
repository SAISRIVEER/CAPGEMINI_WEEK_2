class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolder = "Vishal";
        b.accountNumber = "181007";
        b.balance = 204053;

        b.displayBalance();
        b.deposit(70000);
        b.withdraw(3250);
        b.withdraw(25500);  // Should fail
        b.displayBalance();
    }
}
