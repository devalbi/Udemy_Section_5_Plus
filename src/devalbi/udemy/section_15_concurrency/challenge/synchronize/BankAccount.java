package devalbi.udemy.section_15_concurrency.challenge.synchronize;

final class BankAccount {

    private double balance;
    private String accountNumber;
    private Object object = new Object();

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
}



