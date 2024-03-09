public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". Current balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance for " + name + ": $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 100);
        account1.checkBalance();
        account1.deposit(50);
        account1.withdraw(30);
        account1.checkBalance();
    }
}