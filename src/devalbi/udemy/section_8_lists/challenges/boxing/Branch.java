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
    public void addCustomerToBranch(String name, double transaction){
        Customer newCustomer = Customer.newCustomer(name, transaction);
        if((newCustomer == null) || (doesCustomerExist(name)) || (transaction == 0)){
            System.out.println("\nError adding customer.");
        }
        System.out.println("New Customer " + newCustomer.getName() + " was added to branch " + getBranchName());
        customers.add(newCustomer);
    }

    public void customerTransaction(Customer customer, double value) {
        customer.addTransaction(value);

        //Validation done in Bank Class
       /* if(customer == null) {
            System.out.println("No customer with name " + (customer.getName()));
        }
        //Checks to see if transaction has a value greater or less than 0.
        if (value == 0) {
            System.out.println("Cannot carry out a transaction with value " + value);
            return;
        }
        //Prints out different message depending on deposit or withdrawal.
        //Example of Autoboxing, double value to Double ArrayList
        if (value > 0) {
            System.out.println("Customer " + customer.getName() + " has deposited $" + value);
            customer.addTransaction(value); //Example of autoboxing: double -> Double
        }
        if (value < 0) {
            System.out.println("Customer " + customer.getName() + " has withdrawn $" + value);
            customer.addTransaction(value); //autoboxing, primitive added to Double arraylist.
        }*/
    }

    public Customer findCustomerByName(String name){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().toLowerCase().contains(name.toLowerCase())){  //Use tolower() to avoid some potential issues with uppercase.
                return customers.get(i);
            }
        }
        return null;
    }

    //checks to see if customer exists, returns true if does, false if not
    private boolean doesCustomerExist(String name){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().toLowerCase().contains(name.toLowerCase())){  //Use tolower() to avoid some potential issues with uppercase.
                return true;
            }
        }
        return false;
    }

    public void printBranchesDetails(){
        for(int i = 0; i < customers.size(); i++){
            String name = customers.get(i).getName();
            System.out.println("\nCustomer " + name + ".");
            customers.get(i).printTransactions();
        }
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

    public static Branch addBranch(String name){
        Branch newBranch = new Branch(name);
        return newBranch;
    }
}
