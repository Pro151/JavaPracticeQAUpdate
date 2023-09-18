public class BankAccount {
    // Private instance variables (data to be hidden)
    private String accountNumber;
    private double balance;
    private String ownerName;

    // Constructor to initialize the account
    public BankAccount(String accountNumber, double initialBalance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.ownerName = ownerName;
    }

    // Public methods to interact with the object's state
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

public class DataHidingExample {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("123456", 1000.0, "John Doe");

        // Accessing the object's state through public methods
        System.out.println("Account owner: " + account.getOwnerName());
        System.out.println("Initial balance: $" + account.getBalance());

        // Depositing and withdrawing funds
        account.deposit(500.0);
        account.withdraw(200.0);

        // Checking the updated balance
        System.out.println("Updated balance: $" + account.getBalance());
    }
}
