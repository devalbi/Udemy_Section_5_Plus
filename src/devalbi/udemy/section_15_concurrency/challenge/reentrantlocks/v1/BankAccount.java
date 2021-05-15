package devalbi.udemy.section_15_concurrency.challenge.reentrantlocks.v1;

final class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("New balance is " + this.balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("New balance is " + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}



