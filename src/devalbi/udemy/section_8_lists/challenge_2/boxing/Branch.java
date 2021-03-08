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


    void addCustomer(Customer newCustomer) {
        if(isCustomerInBranch(newCustomer)) {
            System.out.println("Customer is already a member of the branch");
            return;
        }

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

    boolean isCustomerInBranch(Customer customer) {
        if (customer != null) {
            System.out.println("Customer cannot be null");
            return false;
        }

        for(int i=0; i<customerList.size(); i++) {
            if(customerList.get(i).equals(customer)) {
                System.out.println("Customer "+ customer.getName() + " found");
                return true;
            }
        }
        System.out.println("Customer is not in the branch");
        return false;
    }

    void printCustomersInBranch() {
        if(customerList.isEmpty()) {
            System.out.println("Branch does not contain any customers");
        }

        for(int i=0; i<customerList.size(); i++) {
            System.out.println("Customer: " + customerList.get(i).getName() +"\n" +
                    "Transactions");
            for(int x=0; i<customerList.get(i).getTransactionList().size(); x++) {
                customerList.get(i).printTransaction();
            }
        }
    }

    public String getBranchName() {
        return branchName;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
