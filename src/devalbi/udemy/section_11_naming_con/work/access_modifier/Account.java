package devalbi.udemy.section_11_naming_con.work.access_modifier;

import java.util.ArrayList;

public class Account {
    private String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now: " + this.balance);
        } else {
            System.out.println("Cannot deposit a negative amount");
        }
    }

    public void withdrawl(int amount){
        //Var is not allowed to be protected or private within class.
//        private int withdrawl = -amount;
//        protected int withdrawl = -amount;
        int withdrawl = -amount;

        if(withdrawl < 0){
            transactions.add(withdrawl);
            this.balance += withdrawl;
            System.out.println(amount + " withdrawn. Balance is now: " + this.balance );
        } else {
            System.out.println("Cannot withdraw a positive amount");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for(int i : this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated Balance is: " + this.balance);
    }
}
