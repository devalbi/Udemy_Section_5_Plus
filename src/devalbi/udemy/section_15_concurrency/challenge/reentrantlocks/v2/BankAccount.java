package devalbi.udemy.section_15_concurrency.challenge.reentrantlocks.v2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class BankAccount {

    private volatile double balance;
    private final String accountNumber;
    private Lock lock;


    public BankAccount(String accountNumber, double initialBalance/*, ReentrantLock lock*/) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        if(amount <=0 ) {
            return;
        }
        boolean status = false;

        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)) {
                try {
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                    System.out.println("New balance is " + this.balance);
                }
            } else {
                System.out.println("could not get the lock on withdraw method");
            }
        } catch (InterruptedException e) {
            System.out.println("could not get the lock on withdraw method");
        }

        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount) {
        if(amount <=0 ) {
            return;
        }
        boolean status = false;

        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                    System.out.println("New balance is " + this.balance);
                }
            } else {
                System.out.println("could not get the lock on withdraw method");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number: " + this.accountNumber);
    }
}



