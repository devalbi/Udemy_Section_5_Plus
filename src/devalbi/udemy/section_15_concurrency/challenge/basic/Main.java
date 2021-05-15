package devalbi.udemy.section_15_concurrency.challenge.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    /*
    * 1. Two Threads on 1 instance of Bank Account
    * 2. Initial Balance of 1000
    * 3. T1 deposits 300
    * 4. T1 Withdraw 50
    * 5. T2 Deposit 203.75
    * 6. T2 withdraw 100*/

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234-4567", 1000.00);
        ReentrantLock lock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        BankDeposit bd1 = new BankDeposit(bankAccount, 300, lock);
        BankWithdawl bw1 = new BankWithdawl(bankAccount, 50, lock);

        BankDeposit bd2 = new BankDeposit(bankAccount, 203.75, lock);
        BankWithdawl bw2 = new BankWithdawl(bankAccount, -100, lock);

        executorService.execute(bd1);
        executorService.execute(bw1);
        executorService.execute(bd2);
        executorService.execute(bw2);


        executorService.shutdown();
    }

}
