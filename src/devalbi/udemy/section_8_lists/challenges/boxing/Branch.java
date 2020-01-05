package devalbi.udemy.section_8_lists.challenges.boxing;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    //Creates and adds new customer to ArrayList
    public boolean addCustomerToBranch(String customerName, double transaction) {
        Customer newCustomer = Customer.newCustomer(customerName, transaction);
        if ((newCustomer == null) || (findCustomerByName(customerName) == null) || (transaction == 0)) {
            return false;
        }

        customers.add(newCustomer);
        return true;
    }

    public boolean customerTransaction(String customerName, double transaction) {
        Customer customer = findCustomerByName(customerName);
        if (customer == null || (transaction == 0)) {
            return false;
        }

        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomerByName(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().toLowerCase().equals(name.toLowerCase())) {  //Use tolower() to avoid some potential issues with uppercase.
                return checkedCustomer;
            }
        }
        return null;
    }

    public void printBranchesDetails() {
        for (int i = 0; i < customers.size(); i++) {
            String name = customers.get(i).getName();
            System.out.println("\nCustomer " + name + ".");
            customers.get(i).printTransactions();
        }
    }

    //Static Method to create a new branch object.
    public static Branch addBranch(String name){
        Branch newBranch = new Branch(name);
        return newBranch;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
