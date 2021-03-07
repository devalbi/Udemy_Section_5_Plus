package devalbi.udemy.section_8_lists.challenge_2.boxing;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Double> transaction;

    public Customer(String name) {
        this.name = name;
        this.transaction = new ArrayList<>();
    }

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transaction = new ArrayList<>();
        transaction.add(initialTransaction);
    }

    void depositTransaction(double depositVal) {
        if (depositVal <= 0) {
            System.out.println("You must deposit more than 0");
        }
        //Autoboxing
        transaction.add(depositVal);
    }

    void withdrawTransaction(double withdrawalVal) {
        if (withdrawalVal > 0) {
            System.out.println("You must withdraw more than 0");
        }
        //Autoboxing
        transaction.add(withdrawalVal);
    }

    void printTransaction() {
        for (int i=0; i<transaction.size(); i++) {
            System.out.println("Transaction: " + transaction.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransaction() {
        return transaction;
    }
}
