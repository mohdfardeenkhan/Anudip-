class BankAccount {
    private double balance;
    private static int accountCounter = 0;
    private int accountNumber;

    public BankAccount() {
        this.balance = 0.0;
        this.accountNumber = ++accountCounter;
    }

    // Method to deposit a fixed amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to deposit a variable amount with an optional description
    public void deposit(double amount, String description) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " (" + description + ")");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to deposit money from another account
    public void deposit(BankAccount fromAccount, double amount) {
        if (amount > 0 && fromAccount.balance >= amount) {
            fromAccount.balance -= amount;
            this.balance += amount;
            System.out.println("Transferred " + amount + " from account " + fromAccount.getAccountNumber());
        } else {
            System.out.println("Invalid amount or insufficient funds. Transfer failed.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100); // Expected: Deposited 100.0
        System.out.println("Balance: " + account.getBalance()); // Expected: Balance: 100.0

        account.deposit(50, "Salary"); // Expected: Deposited 50.0 (Salary)
        System.out.println("Balance: " + account.getBalance()); // Expected: Balance: 150.0

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.deposit(100); // Expected: Deposited 100.0
        account2.deposit(account1, 50); // Expected: Transferred 50.0 from account 1
        System.out.println("Account 1 Balance: " + account1.getBalance()); // Expected: Account 1 Balance: 50.0
        System.out.println("Account 2 Balance: " + account2.getBalance()); // Expected: Account 2 Balance: 50.0
    }
}
