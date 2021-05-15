package devalbi.udemy.section_15_concurrency.challenge.basic;

import java.util.concurrent.locks.ReentrantLock;

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
                if (depositAmount >= 0 && bankAccount != null) {
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
                System.out.println("Must enter correct account number and positive number");
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
