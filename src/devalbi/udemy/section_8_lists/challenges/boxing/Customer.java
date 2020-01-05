package devalbi.udemy.section_8_lists.challenges.boxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        if(initialTransaction <= 0){ //Ensure initial transaction cannot be <= 0, as cannot set initial bank account to below 0.
            transactions.add(0.0d);
        } else{
            transactions.add(initialTransaction); //Example of Autoboxing for initial transaction
        }
    }

    public Customer(String name) {
        this.name = name;
    }

    public void addTransaction(double value){
        transactions.add(value); //Example of autoBoxing: double -> Double
    }

    public void printTransactions(){
        for(int i = 0; i < transactions.size(); i++){
            System.out.println("Transaction " + i +": " + transactions.get(i));
        }
    }

    //Static method to add a customer.
    public static Customer newCustomer(String name, double transaction){
        return new Customer(name, transaction); //Example of Autoboxing for initial transaction
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
