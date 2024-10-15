import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class Customer {
    private String name;
    private Account account;

    public Customer(String name, String accountNumber) {
        this.name = name;
        this.account = new Account(accountNumber);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}

class Transaction {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "ACC123");
        Account account = customer.getAccount();

        account.deposit(1000);
        account.withdraw(300);
        System.out.println("Balance: " + account.getBalance());
    }
}
