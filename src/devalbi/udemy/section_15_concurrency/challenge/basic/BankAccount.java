package devalbi.udemy.section_15_concurrency.challenge.basic;

import java.util.concurrent.locks.ReentrantLock;

final class BankAccount {

    private volatile double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("New balance is " + this.balance);
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
        System.out.println("New balance is " + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class BankDeposit implements Runnable {
    private BankAccount bankAccount;
    private double depositAmount;
    private ReentrantLock bufferLock;

    public BankDeposit(BankAccount bankAccount, double depositAmount, ReentrantLock bufferLock) {
        this.bankAccount = bankAccount;
        this.depositAmount = depositAmount;
        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (depositAmount >= 0 || bankAccount != null) {
                    bufferLock.lock();
                    try {
                        bankAccount.deposit(depositAmount);
                        System.out.println(String.format(
                                Thread.currentThread().getName() + ",Depositing %s to account %s.",
                                this.depositAmount,
                                this.bankAccount.getAccountNumber()));
                    } finally {
                        bufferLock.unlock();
                        break;
                    }
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class BankWithdawl implements Runnable {
    private BankAccount bankAccount;
    private double withdrawlAmount;
    private ReentrantLock bufferLock;

    public BankWithdawl(BankAccount bankAccount, double withdrawlAmount, ReentrantLock bufferLock) {
        this.bankAccount = bankAccount;
        this.withdrawlAmount = withdrawlAmount;
        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        while(true) {
            try {
                if (withdrawlAmount >= 0 || bankAccount != null) {
                    bufferLock.lock();
                    try {
                        bankAccount.withdraw(withdrawlAmount);
                        System.out.println(String.format(
                                Thread.currentThread().getName() + ", Withdrawing %s from account %s.",
                                this.withdrawlAmount,
                                this.bankAccount.getAccountNumber()));
                    } finally {
                        bufferLock.unlock();
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}



