package devalbi.udemy.section_15_concurrency.challenge.reentrantlocks.v2;

public class Main {

    /*
    * 1. Two Threads on 1 instance of Bank Account
    * 2. Initial Balance of 1000
    * 3. T1 deposits 300
    * 4. T1 Withdraw 50
    * 5. T2 Deposit 203.75
    * 6. T2 withdraw 100
    * Update:
    * Make Synchronized
    * Make Thread Safe*/

    public static void main(String[] args) {
//        ReentrantLock lock = new ReentrantLock();
        BankAccount bankAccount = new BankAccount("1234-4567", 1000.00/*lock*/);

        long startTime = System.nanoTime();
        long endTime;
        try {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    bankAccount.deposit(300);
                    bankAccount.withdraw(50);
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    bankAccount.deposit(203.75);
                    bankAccount.withdraw(100);
                }
            });

            t1.start();
            t2.start();

        } finally {
            endTime = System.nanoTime();
            timer(startTime, endTime);
        }
    }
    public static void timer(long startTime, long endTime){
        long avgTime = endTime - startTime;
        System.out.println(String.format("Time took: %s", avgTime));
    }
}
