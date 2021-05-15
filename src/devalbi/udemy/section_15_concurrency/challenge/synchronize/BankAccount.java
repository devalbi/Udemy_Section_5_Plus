package devalbi.udemy.section_15_concurrency.challenge.synchronize;

final class BankAccount {

    private volatile double balance;
    private final String accountNumber;
    private final Object object = new Object();

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        synchronized (object) {
            balance += amount;
        }
        System.out.println("New balance is " + this.balance);
    }

    public void withdraw(double amount) {
        synchronized (object) {
            balance -= amount;
        }
        System.out.println("New balance is " + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number: " + this.accountNumber);
    }
}



