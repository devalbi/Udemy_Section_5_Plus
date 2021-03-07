package devalbi.udemy.section_8_lists.challenge_2.boxing;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private String branchName;
    private List<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<>();
    }

    void addCustomer(String customerName, double initialTransaction) {
        if(customerName.isEmpty()) {
            System.out.println("Customer must provide a name");
            return;
        } else if (initialTransaction <= 0) {
            System.out.println("Customer must provide initial transaction");
        }

        Customer newCustomer = new Customer(customerName, initialTransaction);
        customerList.add(newCustomer);
    }

    void customerTransaction(Customer customer, double transaction) {
        if(transaction <= 0 ) {
            System.out.println("Transaction must be greater than 0");
            return;
        }
        int indexValue = findCustomer(customer);

        //Autoboxing
        customerList.get(indexValue).depositTransaction(transaction);
        return;
    }

    Customer findCustomer(String customerName) {
        for (int i=0; i<customerList.size(); i++) {
            if(customerList.get(i).getName().equals(customerName)) {
                System.out.println("Customer " + customerList.get(i).getName() +
                        " was found");
                return customerList.get(i);
            }
        }
        System.out.println("Customer " + customerName + " was not found");
        return null;
    }

    int findCustomer(Customer customer) {
        for (int i=0; i<customerList.size(); i++) {
            if(customerList.get(i).getName().equals(customer.getName())) {
                System.out.println("Customer " + customerList.get(i).getName() +
                        " was found");
                return i;
            }
        }
        System.out.println("Customer " + customer.getName() + " was not found");
        return -1;
    }
}
