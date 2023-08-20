package OOPSProblemJava.BasicExample;

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class MainEnc {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        double balance = account.getBalance();
        System.out.println("Balance: " + balance);
    }
}
