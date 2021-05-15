package devalbi.udemy.section_15_concurrency.challenge.reentrantlocks;

import java.util.concurrent.locks.ReentrantLock;

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
        while (true) {
            try {
                if (withdrawlAmount >= 0 && bankAccount != null) {
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
                System.out.println("Must enter correct account number and positive number");
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
